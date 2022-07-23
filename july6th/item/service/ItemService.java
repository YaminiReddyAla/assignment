package july6th.item.service;

import java.util.ArrayList;

import july6th.item.model.Item;
import july6th.item.model.ItemStatus;

public interface ItemService {

	ItemStatus checkItemDetails(int itemNo);

	ItemStatus updatedItem(Item updatedItem);

	ArrayList<Item> getAllItems();

	ArrayList<Item> getAllItemsLessThanPrice(int price);

	ItemStatus addItem(Item newItem);

}
