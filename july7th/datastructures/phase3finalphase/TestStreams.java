package july7th.datastructures.phase3finalphase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import july7th.datastructures.phase1.Item;

public class TestStreams {
	
	public static void main(String[] args) {
		
		List<Item> items =new ArrayList<>();
		items.add(new Item(1,"A",3,"stn"));
		items.add(new Item(2,"B",4,"stn"));
		items.add(new Item(3,"C",5,"gift"));
	/*
		long x =System.currentTimeMillis();
		List<Item> nonLamda = new ArrayList();
		for(Item i:items)
		{
			if(i.getPrice()>3)
					nonLamda.add(i);
			
		}
		long y =System.currentTimeMillis();
		System.out.println("without lamda " + (y-x));
		
		*/
		
		
		
		
		//want to get all items where price > 3
		
		long x =System.currentTimeMillis();
		List<Item> priceItems= items.stream().
				filter(item->item.getPrice()>3).
				collect(Collectors.toList());
		long y =System.currentTimeMillis();
		System.out.println("without lamda " + (y-x));
		
		
		
		System.out.println(priceItems);
				
		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		List<String> names =new ArrayList<String>();
		names.add("Hello");
		names.add("Hi");
		names.add("Freak");
		
		List<String> hStrings =new ArrayList();
		
		for(String name:names)
		{
				if(name.startsWith("H"))
					 hStrings.add(name);
				
				
				
		}	
		
		System.out.println(hStrings);
		
		
		List<String> hNames1= names.stream().
		filter(name->name.startsWith("H")).
		collect(Collectors.toList());
		
		System.out.println(hNames1);
		
		
		//pick up all elements in the list with stars wiht H and create a new list
		//out of it
		
		
		
		
		

	}

}
