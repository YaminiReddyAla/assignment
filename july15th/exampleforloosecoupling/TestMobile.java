package july15th.exampleforloosecoupling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import july14th.annotations.TC;
import july15th.architectur.service.ServiceLayeImplementation;
import july15th.exampleofloosecoupling.service.MobilePhone;
@ComponentScan("july15th.exampleofloosecoupling")
public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ac=new  AnnotationConfigApplicationContext(TestMobile.class);
     MobilePhone mobilePhone=ac.getBean(MobilePhone.class);
     mobilePhone.nameOfMobile();
     mobilePhone.colourOfMobile();
	}

}
