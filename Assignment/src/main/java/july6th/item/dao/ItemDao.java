package july6th.item.dao;

import java.util.ArrayList;

import july6th.item.model.Item;
import july6th.item.model.ItemStatus;

public interface ItemDao {

	ItemStatus getItemDetailFromDB(int itemNo);

	ItemStatus updateItemsInDB(Item updatedItem);

	
}
