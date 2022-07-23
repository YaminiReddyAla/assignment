package july6th.item.dao;

import java.util.ArrayList;

import july6th.item.model.Item;
import july6th.item.model.ItemStatus;

public interface ItemDao {

	ItemStatus getItemDetailFromDB(int itemNo);

	ItemStatus updateItemsInDB(Item updatedItem);

	ArrayList<Item> getAllItemsFromDb();

	ArrayList<Item> getAllItemsLessThanPriceFromDB(int price);

	ItemStatus addItemInDb(Item newItem);

}
