package com.exceptionHandingAssignment;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.exeptionHandlingex.DontLike2Exception;

public class TestEmployee {

	private static final String String = null;

	public static void main(String[] args) {
		
		ArrayList<Employee> employDetails=new ArrayList<>();
		
		try {
			
			   String empName=JOptionPane.showInputDialog("Enter Employee Name:");
			   String empId=JOptionPane.showInputDialog("Enter Employee Id:");
			  int empNum=Integer.parseInt(empId);
               if(empNum==0)
               {
            	   WrongEmployeeException   wrongEmployeeException=new   WrongEmployeeException();
                   throw   wrongEmployeeException;
               }
			  
			  String deptNo= JOptionPane.showInputDialog( "Emnter deptNo");
			  int deptNum=Integer.parseInt(deptNo);
			  Employee employee=new Employee(empNum,empName,deptNum);
			  employDetails.add(employee);
			  String details=employee.getEmpName()+" "+employee.getEmpid()+" "+employee.getDeptId();
		     JOptionPane.showMessageDialog(null, details);			
		     } catch (Exception e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null,"please enter Employee number");
					}
					}
					
				}
	


