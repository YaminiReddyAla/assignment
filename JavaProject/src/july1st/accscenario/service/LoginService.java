package july1st.accscenario.service;

import july1st.accscenario.model.LoginStatus;

public class LoginService {
	
	private LoginDAO  loginDAO =new LoginDAO();
	

	public LoginStatus verifyUser(int accountNo, int pin) {
		// TODO Auto-generated method stub
		return loginDAO.verifyFromDB(accountNo,pin);
	}

}
