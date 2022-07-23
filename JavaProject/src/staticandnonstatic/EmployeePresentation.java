package staticandnonstatic;

public class EmployeePresentation {
	
	private EmployeeService employeeService=new EmployeeService();//logic

	public void startTheApp() {
		// TODO Auto-generated method stub
		//capture input needed for the logic from the user
		//call the logic
		// based on what logic told update the UI.
		gettingEmployeeDetailsBasedonEmployeeNumber();
		
		
		
		
	}

	private void gettingEmployeeDetailsBasedonEmployeeNumber() {
		// TODO Auto-generated method stub
		int empno = UI.acceptNumber("employee number");
		//hardest thing of real life, service function design.
		Employee x =employeeService.getEmployeeDetails(empno);
		//suppose empno is not found, how will this guy know that empno is not found..
		if(x.getEmpno() == -1) //-1 .. we should use it we should use ENUM, dinosaur project in java
			//constats in interface
		{
				UI.display("Employee number not found");
		}
		else
		{
			
			String message =x.getEmpno() + "  " + x.getEmployeeName()   +  "  " + x.getDeptId();
			UI.display(message);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
