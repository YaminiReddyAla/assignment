package july7th.datastructures.phase1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public static void main2(String[] args) {
		
		Map<Integer, Item> shoppingcart
		=new HashMap<Integer, Item>();
		
		Item item =new Item(1,"A",3,"stn");
		
		Item temp = shoppingcart.put(item.getItemNo(), item);
		System.out.println("temp should be null   " + temp);
		
		item =new Item(1,"B",4,"gift");
		
		temp = shoppingcart.put(item.getItemNo(), item);
		
		System.out.println("temp should be null   " + temp);
		
		System.out.println(shoppingcart);
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Item> shoppingcart
		=new HashMap<Integer, Item>();
		
		Item item =new Item(1,"A",3,"stn");
		shoppingcart.put(item.getItemNo(), item);
		
		item =new Item(3,"B",4,"gift");
		shoppingcart.put(item.getItemNo(), item);
		
		item =new Item(3,"x",14,"z");
		shoppingcart.put(item.getItemNo(), item);
		
		
		
		
		item =new Item(5,"C",7,"stn");
		shoppingcart.put(item.getItemNo(), item);
		
		//getting the value specifying the key.
		
		
		/*
		Integer key =13;
		
		item = shoppingcart.get(key);
		if(item ==null)
		{
			System.out.println(key   +  " not found");
		}
		else {
			System.out.println("value is " + item);
		
		}
		*/
		
		
Integer key =13;
		
		item = shoppingcart.remove(key);
		if(item ==null)
		{
			System.out.println(key   +  " not found");
		}
		else {
			System.out.println("key and value is removed");
		
		}
		
		//running thru the map
		Set<Entry<Integer, Item>> entries = shoppingcart.entrySet();
		for(Entry<Integer, Item> entry: entries)
		{
			 key = entry.getKey();
			item =  entry.getValue();
			// we are able to get each key and its corresponding value
			System.out.println(key  + " --"  + item);
			
		}
		
		
		//pick only keys
		Set<Integer> itemnos = shoppingcart.keySet();
		for(Integer itemno: itemnos)
		{
			System.out.println(itemno);
		}
		
		
		//pick only values.
		Collection<Item> items = shoppingcart.values();
		for(Item eachItem :items)
		{
			System.out.println(eachItem);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//most stupid thing
		System.out.println(item);

	}

}
