package emp.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import emp.assignment.service.EmployeService;

@SpringBootApplication
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestEmployee.class, args);
	}
	@Autowired
	private EmployeService employeService;

}
