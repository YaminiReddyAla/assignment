package july15th.loosecoupling.service;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements PaymentInteface {

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("making payment via HDFC");

	}

}
