package july7th.datastructures.phase2;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import july7th.datastructures.phase1.Item;

public class OtherPersonDesign {
	
	public static void main(String[] args) {
		
		List<FinTransaction> transactions=new ArrayList<FinTransaction>();
		transactions.add(new FinTransaction(1, 10, 3));
		transactions.add(new FinTransaction(3, 20, 4));
		
		Object toFind =new FinTransaction(1, 0, 0);
		int pos=transactions.indexOf(toFind);
		if(pos >= 0)
		{
			System.out.println(transactions);
			System.out.println("found transaction object at pos" + pos);
			FinTransaction finTransaction = transactions.get(pos);
			// how to change the the paramters in fintransaction object anwer 
			//we cannot why immutable
			FinTransaction newFinTransaction =
					new FinTransaction(finTransaction.getAccountNumber(), 40, finTransaction.getLocationId());
			transactions.set(pos,newFinTransaction);
			//we had to creste a new object and set it taht pos becuase object is immutable
			System.out.println("after so called modifiction"  + transactions);
			
		}
		else
		{
			System.out.println("transaction object not found");
		}
		
		
		
		List<Customer> customersList =new ArrayList<Customer>();
		customersList.add(new Customer(1,3,"blr","abc@def.com"));
		customersList.add(new Customer(4,4,"agra","ghi@ijk.com"));
		customersList.add(new Customer(2,2,"cochin","mno@pqr.com"));
		
		toFind =new Customer(1, 0, "","");
		 pos=transactions.indexOf(toFind);
		 
		 System.out.println(customersList);
		if(pos >= 0)
		{
			System.out.println("found customer object at pos" + pos);
			Customer customer = customersList.get(pos);
			customer.setLocation("mys"); 
			//we dont need new object if we are talking about mutable objects
			System.out.println("after modification" + customersList);
			
		}
		else
		{
			System.out.println("customer object not found");
		}
		
		
		
		
		
		
		
	}
	
	
	public static void main8(String[] args) {
		
		List<Customer> customersList =new ArrayList<Customer>();
		customersList.add(new Customer(1,3,"blr","abc@def.com"));
		customersList.add(new Customer(4,4,"agra","ghi@ijk.com"));
		customersList.add(new Customer(2,2,"cochin","mno@pqr.com"));
		
		
		//create a class called Emp  empno, empname, deptid and email.
		
		//provide natural sort comparable -- empno
		//crete two comparators, one on empname and deptid
		//and prove depending on which you pass sort happens accordingly.
		
		Comparator<Customer>  mobilenoComparison =new MobileComparison();
		
		
		Comparator<Customer>  locationcomparison =new LocationComparison();
		
		//customersList.sort(mobilenoComparison);
		
		customersList.sort(locationcomparison);
		
		System.out.println(customersList);
		
		
		
		
		
	}
	
	public static void main7(String[] args) {
		
		Set<Customer> customers =new TreeSet<Customer>();
		customers.add(new Customer(1,3,"blr","abc@def.com"));
		customers.add(new Customer(4,4,"agra","ghi@ijk.com"));
		customers.add(new Customer(2,5,"cochin","mno@pqr.com"));
		System.out.println(customers);
		
		
		List<Customer> customersList =new ArrayList<Customer>();
		customersList.add(new Customer(1,3,"blr","abc@def.com"));
		customersList.add(new Customer(4,4,"agra","ghi@ijk.com"));
		customersList.add(new Customer(2,5,"cochin","mno@pqr.com"));
		Collections.sort(customersList);
		System.out.println(customersList);
		
		
		
	}
	
	
	public static void main6(String[] args) {
		
		A obj =new A(2,3);
		Set<A> poc=new HashSet();
		poc.add(new A(1,3));
		poc.add(new A(1,3));
		System.out.println(poc.size());
		
		
	
		
		
	}
	
	public static void main5(String[] args) {
		
		/*
		List<String> names=
				new ArrayList<String>();
		names.add("ramesh");
		names.add("suresh");

		Object toFind =new FileWriter("a.txt");
		
		int pos = names.indexOf(toFind);
		
		*/
		
 		
		// write a code with Employee where empno, empname and deptid.
		// meaning of equals in Employee empno and deptid should match
		
		List<Item> items
		=new ArrayList<Item>();
		items.add(new Item(1,"pencil",3,"stn"));
		items.add(new Item(3,"pen",10,"stn"));
		items.add(new Item(7,"bag",400,"stn"));
		
		Object toFind =new Item(3,"",0,"");
		
		int pos = items.indexOf(toFind);
		
		if( pos != -1)
			System.out.println("found at pos" + pos);
		else
			System.out.println("not found " + pos);
		
		
		
		
		
	}
	
	
	public static void main4(String[] args) {
		
		int x[]= {3,1,2,7,8,910,11,3,4,6,7}; //array 
		int searchNumber =11;
		Arrays.sort(x);
		int pos = Arrays.binarySearch(x, searchNumber);
		if( pos >=0)
			System.out.println("found at pos " + pos);
		else
			System.out.println("not found");
		
		
		
	}
	
	
	public static void main3(String[] args) {
		
		List<Item> items =new ArrayList<Item>();
		
		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		// locating an element in the List.
		List<String> names=new ArrayList<String>();
		names.add("abc");
		names.add("def");
		names.add("ghi");
		
		// we want to search for something in the List.
		String toSearch="freak";
		int pos = names.indexOf(toSearch);// 
		if( pos != -1)
			System.out.println("Found at pos" + pos);
		else
			System.out.println("not found");
		
		
		
		
		

	}

}
