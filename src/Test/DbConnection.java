package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomerce", "root", "Gneha@10");	
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("select * from eproduct");
		while (result.next()) {
			System.out.println("Product Id " + result.getInt("ID"));
			System.out.println("Product name " + result.getString("name"));
		}
		con.close();
	}
}
