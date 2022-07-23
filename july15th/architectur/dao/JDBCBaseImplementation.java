package july15th.architectur.dao;

import org.springframework.stereotype.Component;


public class JDBCBaseImplementation implements Dao {

	@Override
	public void checkWithDB() {
		// TODO Auto-generated method stub
     System.out.println("checking login with db using JDBC");
	}

	@Override
	public void getCustomerDetailsFromDB() {
		// TODO Auto-generated method stub
   System.out.println("getting customer details from db using jdbc");
	}

}
