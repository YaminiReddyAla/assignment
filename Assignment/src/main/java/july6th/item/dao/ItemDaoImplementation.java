package july6th.item.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import july6th.item.model.Item;
import july6th.item.model.ItemStatus;
@Repository
public class ItemDaoImplementation implements ItemDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ItemStatus getItemDetailFromDB(int itemNo) {
		// TODO Auto-generated method stub

		ItemStatus itemStatus =new ItemStatus(0,"not fount",new Item(0,"",0,""));
		
		System.out.println("inside DAO"  + (jdbcTemplate != null));
	
		Item item = new Item();
		String sql = "select itemNo, itemName,price,category from item where itemNo=? ";
		Object params[]= {itemNo};
		BeanPropertyRowMapper<Item> bpm =new BeanPropertyRowMapper<Item>(Item.class);
		
		try {
			item = jdbcTemplate.queryForObject(sql,params,bpm);
			itemStatus.setStatusCode(1);
			itemStatus.setMessage("successful");
			itemStatus.setItem(item);
		
		
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
			}
		
		
		return itemStatus;
	}


	@Override
	public ItemStatus updateItemsInDB(Item updatedItem) {
		ItemStatus itemStatus =new ItemStatus(0,"not found", new Item(0,"", 0,""));
		System.out.println("in dao");
		
		
	
		String sql = "update item  set price= ?, category=? where itemNo=? ";
		Object params[]= { updatedItem.getPrice(),updatedItem.getCategory(), updatedItem.getItemNo() };
		int rowsAffected =jdbcTemplate.update(sql,params);
		if(rowsAffected > 0)
		{
			itemStatus.setStatusCode(1);
			itemStatus.setMessage("update success");
			
			
		}
		return itemStatus;
	}
}
