package july15th.exampleofloosecoupling.dao;

import org.springframework.stereotype.Component;

@Component
public class IdeaSim implements SimCardHoloder {
	public void getSimName() {
		// TODO Auto-generated method stub
		System.out.println("SIM Name is Airtel ");
	}
	public void getSignal() {
		// TODO Auto-generated method stub
		System.out.println("SIM Signal ");
	}
}
