package july7th.datastructures.phase2;

import java.util.Comparator;

public class LocationComparison implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		System.out.println("comparison based on location");
		String o1location = o1.getLocation();
		String o2location = o2.getLocation();
		int lc = o1location.compareTo(o2location);//string comparsion you can get number
		return lc;
	}

}
