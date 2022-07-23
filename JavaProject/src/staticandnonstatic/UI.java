package staticandnonstatic;

import javax.swing.JOptionPane;

public class UI {

	public static void display(String message) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,message );
		
	}

	public static int acceptNumber(String message) {
		// TODO Auto-generated method stub
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}

}
