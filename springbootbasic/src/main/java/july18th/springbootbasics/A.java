package july18th.springbootbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
public A() {
	System.out.println("A object created");
}
@Autowired
public void horror(B obj) {
	System.out.println("B object wiring in A");
}
public void f1()
{
	System.out.println("this is f1 of A");
}
}
