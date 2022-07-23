package staticandnonstatic;

public class EmployeeService {

	public Employee getEmployeeDetails(int empno) {
		// TODO Auto-generated method stub
		
		//give me database, only then I will do this, relax.. database is not needed, write some mock logic
		Employee e =new Employee();
		e.setEmpno(-1);
		e.setEmployeeName("abc");
		e.setLocation("blr");
		e.setDeptId(23);
		
		//stupid logic it is ok, you dont need databse to start with.. // MOcking..
		
		if(empno != 23)
		{
			e.setEmpno(empno);
		}
		
		return e;
	}

}
