package controller;

import july1st.accscenario.model.LoginStatus;
import july1st.accscenario.service.LoginService;
import theory.org.common.util.GUI;

public class AccountPresentation {
	
	private LoginService loginService =new LoginService();

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start method of AccountPresentation");
		
		String options ="\n 1. Login  \n 0. Exit";
		int choice =-1;
		do {
			choice = GUI.acceptNumber(options);
			if (choice == 1)
				loginScenario();
		} while (choice != 0);
		
		
	}

	private void loginScenario() {
		// TODO Auto-generated method stub
		
		int accountNo = GUI.acceptNumber("account no");
		int pin =GUI.acceptNumber("pin");
		LoginStatus loginStatus= loginService.verifyUser(accountNo,pin);
		if(loginStatus.getStatusCode() == -1)
		{
			GUI.display("login failed");
		}
		else
			GUI.display("login succeeded");
		
		
		
	}

}
