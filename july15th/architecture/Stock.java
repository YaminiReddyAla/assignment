package july15th.architecture;

public class Stock {
private int stockId;
private String stockName;
private int stockPrice;
private String  stockCategory;
public int getStockId() {
	return stockId;
}
public void setStockId(int stockId) {
	this.stockId = stockId;
}
public String getStockName() {
	return stockName;
}
public void setStockName(String stockName) {
	this.stockName = stockName;
}
public int getStockPrice() {
	return stockPrice;
}
public void setStockPrice(int stockPrice) {
	this.stockPrice = stockPrice;
}
public String getStockCategory() {
	return stockCategory;
}
public void setStockCategory(String stockCategory) {
	this.stockCategory = stockCategory;
}
public Stock(int stockId, String stockName, int stockPrice, String stockCategory) {
	super();
	this.stockId = stockId;
	this.stockName = stockName;
	this.stockPrice = stockPrice;
	this.stockCategory = stockCategory;
}
public Stock() {
	super();
	// TODO Auto-generated constructor stub
}

}
