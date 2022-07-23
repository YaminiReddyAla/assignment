package july7th.datastructures.phase2;

import java.util.Comparator;

// we can use lambda expressions here.
public class MobileComparison implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		System.out.println("comparing based on mobile");
		return o1.getMobileNo() - o2.getMobileNo();
	}

}
