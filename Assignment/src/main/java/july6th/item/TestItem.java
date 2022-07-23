package july6th.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import july6th.item.controller.ItemPresentation;
import july6th.item.model.Item;
import july6th.item.model.ItemStatus;
import july6th.item.service.ItemService;

@SpringBootApplication
public class TestItem implements CommandLineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestItem.class, args);
	}
	@Autowired
    private ItemService itemService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println("hey guys");
		
		Item updatedItem =new Item(2,"A",4,"Anything");

	    ItemStatus itemStatus  = itemService.updatedItem(updatedItem); 
	    if(itemStatus.getStatusCode() == 0)
		{
			System.out.println("item details not updated");
			
		}
		else
		{
			System.out.println("item details updated");
			
		}
		
	
	}
	}

