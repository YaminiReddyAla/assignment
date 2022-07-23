package july9th.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadingTextFileHandling {

	public static void main(String[] args) {
		// low priority does not mean zero priority
		
		try {
			FileReader fw =new FileReader("a.exe");//boss class
			BufferedReader pw =new BufferedReader(fw); //assistant class
			String message=pw.readLine();
			pw.close();
			fw.close();
			System.out.println("  file reader  " + message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
