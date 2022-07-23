package july6th.item.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import july6th.item.dao.ItemDao;
import july6th.item.dao.ItemDaoImplementation;
import july6th.item.model.Item;
import july6th.item.model.ItemStatus;
import july6th.item.service.ItemService;
@Service
public class ItemServiceImplementation implements ItemService {
	@Autowired
	private ItemDao itemDao;	

	@Override
	public ItemStatus getItemDetails(int itemNo) {
		// TODO Auto-generated method stub
	
		System.out.println("in service layer");
		
		return itemDao.getItemDetailFromDB(itemNo);
	}

	@Override
	public ItemStatus updatedItem(Item updatedItem) {
		
		return itemDao.updateItemsInDB(updatedItem);
	}


}
