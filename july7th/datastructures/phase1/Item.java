package july7th.datastructures.phase1;

public class Item {
	
	@Override
	public String toString() {
		return "Item [itemNo=" + itemNo + ", itemName=" + itemName + ", price=" + price + ", category=" + category
				+ "]";
	}
	private int itemNo;
	private String itemName;
	private int price;
	private String category;
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Item(int itemNo, String itemName, int price, String category) {
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	
	// write a code with Employee where empno, empname and deptid.
			// meaning of equals in Employee empno and deptid should match
	
	@Override
	public boolean equals(Object obj) {
		// here we should tell our meaning of what is equal
		//and what is not equal.
		
		Item inputItem=(Item) obj;
		Item callingObject = this;
		System.out.println(callingObject.getItemNo() +"   " + inputItem.itemNo);
		
		if(this.itemNo == inputItem.itemNo)
		{
			return true;
			
		}
		
		
		System.out.println("equals function of Item class");
		return false;
	}
	
	

}
