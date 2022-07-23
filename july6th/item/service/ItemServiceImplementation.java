package july6th.item.service;

import java.util.ArrayList;

import july6th.item.dao.ItemDao;
import july6th.item.dao.ItemDaoImplementation;
import july6th.item.model.Item;
import july6th.item.model.ItemStatus;
import july6th.item.service.ItemService;

public class ItemServiceImplementation implements ItemService {
	
	private ItemDao itemDao;
	
	

	public ItemServiceImplementation() {
		// TODO Auto-generated constructor stub
		itemDao =new ItemDaoImplementation();
		
	}



	@Override
	public ItemStatus checkItemDetails(int itemNo) {
		// TODO Auto-generated method stub
		System.out.println("input is" + itemNo);//logging here
		
		
		return itemDao.getItemDetailFromDB(itemNo);
	}



	@Override
	public ItemStatus updatedItem(Item updatedItem) {
		// TODO Auto-generated method stub
		//we dont use any sysout in servie or in DAO
		//logging..
		ItemStatus itemStatus =new ItemStatus(0, "item not found");
		
		return itemDao.updateItemsInDB(updatedItem);
	}



	@Override
	public ArrayList<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemDao.getAllItemsFromDb();
	}



	@Override
	public ArrayList<Item> getAllItemsLessThanPrice(int price) {
		// TODO Auto-generated method stub
		return itemDao.getAllItemsLessThanPriceFromDB(price);
	}



	@Override
	public ItemStatus addItem(Item newItem) {
		// TODO Auto-generated method stub
		return itemDao.addItemInDb(newItem);
	}

}
