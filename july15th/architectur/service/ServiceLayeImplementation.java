package july15th.architectur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import july15th.architectur.dao.Dao;
@Component
public class ServiceLayeImplementation {
    private Dao dao;
    @Autowired
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login has to be done");
		dao.checkWithDB();
	}

	public void getCustomerDetails() {
		// TODO Auto-generated method stub
		System.out.println("get customer details");
		dao.getCustomerDetailsFromDB();
	}

}
