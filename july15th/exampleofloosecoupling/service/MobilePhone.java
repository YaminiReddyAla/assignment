package july15th.exampleofloosecoupling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import july15th.exampleofloosecoupling.dao.SimCardHoloder;
@Component
public class MobilePhone {
   private SimCardHoloder simCardHolder;


   @Autowired
	public void setSimCardHolder(SimCardHoloder simCardHolder) {
	this.simCardHolder = simCardHolder;
}

	public void nameOfMobile() {
		// TODO Auto-generated method stub
		System.out.println("mobile name is getting printed");
		simCardHolder.getSimName();
	}

	public void colourOfMobile() {
		// TODO Auto-generated method stub
		System.out.println("mobile colour is getting printed");
		simCardHolder.getSignal();
	}

}
