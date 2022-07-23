package july9th.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WBinary {
	
	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fos =
					new FileOutputStream("a.pdf");
			ObjectOutputStream os =
					new ObjectOutputStream(fos);
			
			Country country =new Country(12,"A","B");//model in a project
			os.writeObject(country);  //which makes a copy
			
			os.close();
			fos.close();
			
			Country country1=null;
			
			FileInputStream fos1 =
					new FileInputStream("a.pdf");
			ObjectInputStream os1 =
					new ObjectInputStream(fos1);
			
			Object o  = os1.readObject();
			
			country1 = (Country) o;
			
			System.out.println(country1);
			
			System.out.println("== " + ( country1 == country));
			System.out.println(".equals "  + ( country.equals(country)));
			System.out.println(country);
			System.out.println(country1);
			
			
			
			os1.close();
			fos1.close();

			
			
			
			
			
			
			System.out.println("written in binary format");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	//reading binary
	public static void main2(String[] args) {	try {
		FileInputStream fos =
				new FileInputStream("a.pdf");
		ObjectInputStream os =
				new ObjectInputStream(fos);
		
		int x = os.readInt();
		double d = os.readDouble();
		System.out.println(x + "  " + d);
		os.close();
		fos.close();
		
		System.out.println("read  from a binary file");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fos =
					new FileOutputStream("a.pdf");
			ObjectOutputStream os =
					new ObjectOutputStream(fos);
			
			os.writeInt(44);
			os.writeDouble(55);
			
			os.close();
			fos.close();
			
			System.out.println("written in binary format");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
