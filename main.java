package database;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			    String url, username, pass;
			    username ="system";
			    pass = "system";
			    url = "jdbc:oracle:thin:@localhost:1521:XE";
				Connection con = DriverManager.getConnection(url, username, pass);
				System.out.println("Connection availble");
				
				Statement smt = con.createStatement();
				ResultSet rs = smt.executeQuery("select * from emp");
				
				//ResultSet rs = smt.executeQuery("create table dept(name)");
				
				if(rs.next()) {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
				}
				else {
					System.out.println("rec not found");
				}	
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}
}
