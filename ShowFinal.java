package PhaseOneProject;

import java.io.File;
public class ShowFinal {
	public static void showFile() {
		System.out.println(" ");
		System.out.println("The list of all files : ");
		String files[];
		
		try {
			File f = new File("D:\\");
			files = f.list();
			

			for (String pathname : files) {

				System.out.println(pathname);
			}
		}
		catch(NullPointerException  NP) {
			System.out.println("The file does not exist ");
		}
	}

}