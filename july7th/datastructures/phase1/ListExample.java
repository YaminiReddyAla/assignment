package july7th.datastructures.phase1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> items =new ArrayList();
		items.add(new Item(1,"X",2,"Q"));
		items.add(new Item(2,"Y",1,"Q"));
		items.add(new Item(3,"Z",3,"M"));
		
		for(Item item:items)
		{
			System.out.println(item);
			
		}
		

	}

}
