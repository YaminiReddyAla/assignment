package com.exeptionHandlingex;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class TestExample {

	public static void main(String[] args) {
		try {
			
   String s=JOptionPane.showInputDialog("Enter some text");
   int i=Integer.parseInt(s);
   i=i-1;//justify the data type usage by using operations
   if(i==2)
   {
	   DontLike2Exception  dontLike2Exception=new  DontLike2Exception();
	   throw dontLike2Exception;
   }
   i=i-1;
   String message="value of number"+i;
   JOptionPane.showMessageDialog(null, message);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DontLike2Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "give value other than 2");
		}
		
	}

}
