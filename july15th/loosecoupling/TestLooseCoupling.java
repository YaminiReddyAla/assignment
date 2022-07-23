package july15th.loosecoupling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import july15th.loosecoupling.service.Shopping;

@ComponentScan("july15th.loosecoupling")
public class TestLooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(TestLooseCoupling.class);
		Shopping shopping=ac.getBean(Shopping.class);
		shopping.payForShopping();
		shopping.addMoneyToValet();
		

	}

}
