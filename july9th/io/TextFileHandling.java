package july9th.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileHandling {

	public static void main(String[] args) {
		// low priority does not mean zero priority
		
		try {
			FileWriter fw =new FileWriter("a.exe");//boss class
			PrintWriter pw =new PrintWriter(fw); //assistant class
			pw.println("hello world");
			pw.close();
			fw.close();
			System.out.println("written to file successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
