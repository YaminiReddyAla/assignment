package staticandnonstatic;

public class TestStaticAndNonStatic {
	
	
	public static void main(String[] args) {
		
		//given empno get the employeedetails.
		EmployeePresentation employeePresentation =new EmployeePresentation();
		employeePresentation.startTheApp();
		
		
	}
	
	
	public static void main2(String[] args) {
		
		Employee e =new Employee();
		Employee e1=e;
		Employee e2 = new Employee();
		int i=3;
		
		
	}

	
	
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		UI.display("cocnept is important");  //use class like a grouping mechanism, helper functions
		
		
		int i;  //X--creation of the variable
		i =3;
		i = i *4;//y  --operation
		
		
		
		Employee employee=new Employee(); //X // intent is to create a data tpye called Employee
		//why project demands it. project specific data type == model
		employee.setEmpno(44);//y
		Employee.setCompanyName("abc");
		
		
		String s ="hello";
		s.toUpperCase(); //this shows string is a data type
		String y = String.valueOf(3); //ok it has got static function OK that is extra.. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
