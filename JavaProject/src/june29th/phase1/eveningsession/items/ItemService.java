package june29th.phase1.eveningsession.items;

public class ItemService {

	public Item getItemDetails(int itemno) {
		// TODO Auto-generated method stub
		System.out.println("input we get is" + itemno);//sin sin sin 
		//use logging but since I have covered logging using sysout
		Item item=new Item();
		item.setItemno(44);
		if(itemno %2 ==0) //stupid logic
		{
			item.setItemno(-1);
		}
		item.setItemName("pencil");
		item.setPrice(3);
		return item;
	}

}
