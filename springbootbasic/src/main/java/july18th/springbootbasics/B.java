package july18th.springbootbasics;

import org.springframework.stereotype.Component;

@Component
public class B {
	public B() {
		System.out.println("B object created");
	}
	public void f3()
	{
		System.out.println("this is f3 of B");
	}
}
