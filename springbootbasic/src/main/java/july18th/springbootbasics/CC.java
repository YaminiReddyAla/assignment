package july18th.springbootbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CC implements CommandLineRunner{
	@Autowired
 private A a;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(a!=null ?"a is not null" : "a is null");
	}

}
