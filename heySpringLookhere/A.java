package heySpringLookhere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //this is used to tell we need to create an object
public class A {
	
public A() {
	System.out.println("constroctor of A");
}
@Autowired
public void noBodyCares(B obj)
{
	System.out.println("b o0bj is wired in A");
}
}
