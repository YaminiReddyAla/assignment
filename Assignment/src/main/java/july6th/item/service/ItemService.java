package july6th.item.service;

import java.util.ArrayList;

import july6th.item.model.Item;
import july6th.item.model.ItemStatus;

public interface ItemService {

	ItemStatus getItemDetails(int itemNo);

	ItemStatus updatedItem(Item updatedItem);


}
