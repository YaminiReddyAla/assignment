package staticandnonstatic;


//Dept
public class Employee {
	
	//it is alike a data type why.. look at empno, employeename, look at deptid.. location
	//these are non static variables.
	
	
	//content --files
	private int empno;
	private String employeeName;
	private int deptId;
	private String location;
	private static String companyName;//can be changed. static.. yes it i sstatic, but it is not final. hence
	//can be changed
	
	//operations.. people in the dept
	public int getEmpno() //think of it like doing * or / on a number .. operations..
	{
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	//only time non local variables will be made as public is if variable is a constant.. final and static ==constant
	//s tatic variable != connstant.
	//operations..
	
	
	
	
	

}
