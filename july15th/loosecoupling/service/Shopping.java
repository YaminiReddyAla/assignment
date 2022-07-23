package july15th.loosecoupling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shopping {
	
	private PaymentInteface paymentInterface;
	
	
	
	
@Autowired
	public void setPaymentInterface(PaymentInteface paymentInterface) {
		System.out.println("payment wired in shopping");
		this.paymentInterface = paymentInterface;
	}

	public void payForShopping() {
		// TODO Auto-generated method stub
		System.out.println("assume shopping done and now paying");
		paymentInterface.makePayment();
		
	}

	public void addMoneyToValet() {
		// TODO Auto-generated method stub
		System.out.println("assume money is going to be added to the vallet");
		paymentInterface.makePayment();	
	}

}
