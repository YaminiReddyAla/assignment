package july1st.accscenario.service;

import java.util.ArrayList;
import java.util.Iterator;

import july1st.accscenario.model.Account;
import july1st.accscenario.model.LoginStatus;

public class LoginDAO {
	
	//stupid mock thing..
	private ArrayList<Account> accounts =new ArrayList<>();

	
	
	
	public LoginDAO() {
		// TODO Auto-generated constructor stub
		//add 4 account objects into the arraylist.
		accounts.add(new Account(1,"A",10,false,2 ,"A@x.com"));
		accounts.add(new Account(3,"B",20,false,4 ,"B@x.com"));
		accounts.add(new Account(5,"C",30,false,6 ,"C@x.com"));
				
	}




	public LoginStatus verifyFromDB(int accountNo, int pin) {
		// TODO Auto-generated method stub
		LoginStatus loginStatus=new LoginStatus(-1,"login failed");
		for(Account account : accounts)
		{
			if(account.getAccountNo() == accountNo && account.getPin() == pin)
			{
					loginStatus.setStatusCode(1);
					loginStatus.setMessage("login successful");
			}
			
		}
		return loginStatus;
	}

}
