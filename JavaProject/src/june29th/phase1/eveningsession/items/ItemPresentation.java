package june29th.phase1.eveningsession.items;

public class ItemPresentation {
	
	private ItemService itemService =new ItemService();

	public void begin() {
		// TODO Auto-generated method stub
		
		int itemno=22;//assume you got this from the user
		Item item = itemService.getItemDetails(itemno);
		//think how will you tell him thta itemno is not found
		//how will you tell item no is found
		//if item object, itemno is -1, then i will assume itemno is not found
			if(item.getItemno() == -1)
				System.out.println("item no not found");
			else
			{
				String content =item.getItemno() +  "  " +
			item.getItemName() + "  " + item.getPrice();
				System.out.println(content);
						
				
			}
		
	}

}
