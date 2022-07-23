package july6th.item.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import july6th.item.model.Item;
import july6th.item.model.ItemStatus;
import july6th.item.service.ItemService;
import july6th.item.service.ItemServiceImplementation;
@RestController
public class ItemPresentation {
	
	@Autowired
	private ItemService itemService ;

	@GetMapping("/getItemDetails")
	public ResponseEntity<ItemStatus> getItemDetails(@RequestParam int itemNo) {
		
	System.out.println("input " + itemNo);
	
	

	ResponseEntity<ItemStatus> responseEntity =new ResponseEntity<ItemStatus>(HttpStatus.NOT_FOUND);
	if(itemNo != 1)
	{
		
		ItemStatus itemStatus=
				itemService.getItemDetails(itemNo);
		responseEntity =new ResponseEntity<ItemStatus>(itemStatus,HttpStatus.OK);
			
	}
	
	
	return responseEntity;
	
		
	}
	

	@PutMapping("/updateItem")
	public ResponseEntity<ItemStatus> updateItem(@RequestBody Item updatedItem) {

		
		System.out.println("input " + updatedItem);

		ResponseEntity<ItemStatus> responseEntity =new ResponseEntity<ItemStatus>(HttpStatus.NOT_FOUND);
		if(updatedItem.getItemNo() != 1)
		{
			
			ItemStatus itemStatus=
					itemService.updatedItem(updatedItem);//this changes are done
			//to keep the kid happy.
			responseEntity =new ResponseEntity<ItemStatus>(itemStatus,HttpStatus.OK);
				
		}
		return responseEntity;	
		
		
	}

}
