package PhaseOneProject;

import java.util.InputMismatchException;
import java.util.*;
public class ChoosingOptions
{
public static void  display() {
	//@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("1 : Retrieving file names in ascending order ");
		System.out.println("2 : Performing all Business-Level operations ");
		System.out.println("3 : Exit");
		
		System.out.println(" Choose option according to your choice :");
		try{
			int optionSelection  = sc.nextInt();
			switch(optionSelection) {
				case 1 : ShowFinal.showFile();
					break;
				case 2 : PerformingOperations.businessLevelOperation();
					break;
				case 3 :System.out.println("THANK YOU");
					System.exit(0); 
					break;
				default : System.out.println("You have entered WRONG INPUT !!!");
					System.out.println(" ");
					display();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Entered Input is not correct. Input should be in integer !!!!");
		}
		sc.nextLine();
		
	}
	
}
}