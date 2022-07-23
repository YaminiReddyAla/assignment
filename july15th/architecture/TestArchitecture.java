package july15th.architecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.mysql.cj.protocol.Resultset;
import com.sun.tools.javac.util.List;

import july14th.annotations.TC;
import july15th.architectur.service.ServiceLayeImplementation;
@ComponentScan("july15th.architectur")
public class TestArchitecture {
	public static void main(String[] args) {
		try {
			ArrayList<Stock> stocks=new ArrayList<Stock>();
			int stockPrice=100;
			Connection con=getConnection();
			Stock stock=new Stock(2,"B",4,"midcap");
			String sql=" select stockId,stockName,stockPrice,stockCategory from stock where stockId=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			
			stmt.setInt(1,stockPrice);
			ResultSet rs=stmt.executeQuery();
		   
		    while(rs.next()) {
		    	stock=new Stock();
		    	stock.setStockId(rs.getInt("stockId"));
		    	stock.setStockName(rs.getString("stockName"));
		    	stock.setStockPrice(rs.getInt("stockPrice"));
		    	stock.setStockCategory(rs.getString("stockCategory"));
		    	stocks.add(stock);
		    	
		    }
		  if(stocks.isEmpty())
			  System.out.println("no stocks found");
		  else
			  System.out.println(stocks);
	        stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main6(String[] args) {
		try {
			int stockId=23;
			Connection con=getConnection();
			Stock stock=new Stock(2,"B",4,"midcap");
			String sql=" select stockId,stockName,stockPrice,stockCategory from stock where stockId=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			
			stmt.setInt(1,stockId);
			ResultSet rs=stmt.executeQuery();
		   
		    if(rs.next()) {
		    	stock.setStockId(rs.getInt("stockId"));
		    	stock.setStockName(rs.getString("stockName"));
		    	stock.setStockPrice(rs.getInt("stockPrice"));
		    	stock.setStockCategory(rs.getString("stockCategory"));
		    	System.out.println(stock);
		    }
		    else
		    	System.out.println("Stock details not found;");
	        stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main4(String[] args) {
		try {
			Connection con=getConnection();
			Stock stock=new Stock(2,"B",4,"midcap");
			String sql=" update stock set stockPrice=?,stockCategory=? where stockId=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(2, stock.getStockCategory());
			stmt.setInt(3,stock.getStockId());
			stmt.setInt(1, stock.getStockPrice());
		    int ra= stmt.executeUpdate();
		    if(ra>0) 
		    	System.out.println("update successfull");
	        stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main3(String[] args) {
		try {
			Connection con=getConnection();
			Stock stock=new Stock(2,"B",4,"midcap");
			String sql=" insert into stock(stockId,stockName,stockPrice,stockCategory) values(?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(4, stock.getStockCategory());
			stmt.setInt(1,stock.getStockId());
			stmt.setInt(3, stock.getStockPrice());
			stmt.setString(2,stock.getStockName());
			stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static Connection getConnection() {
		
		String driverClass="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3304/demo";
		String userId="root";
		String password="root123";
		Connection connection=null;
		try {
			Class.forName(driverClass);
			connection=DriverManager.getConnection(url,userId,password);
			System.out.println("connection got");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("some sql exception");
			e.printStackTrace();
		}
		return connection;
	}
public static void main2(String[] args) {
	
	String driverClass="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3304/demo";
	String userId="root";
	String password="root123";
	try {
		Class.forName(driverClass);
		Connection connection=DriverManager.getConnection(url,userId,password);
		System.out.println("connection got");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("driver not found");
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("some sql exception");
		e.printStackTrace();
	}
}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
       
		AnnotationConfigApplicationContext ac=new  AnnotationConfigApplicationContext(TestArchitecture.class);
		ServiceLayeImplementation serviceLayer=ac.getBean(ServiceLayeImplementation.class);
		serviceLayer.login();
		serviceLayer.getCustomerDetails();
		
	}

}
