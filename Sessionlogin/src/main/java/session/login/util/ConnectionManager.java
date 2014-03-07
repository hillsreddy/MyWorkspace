/**
 * 
 */
package session.login.util;

/**
 * @author Home
 *
 */
import java.sql.*; 
import java.util.*; 
public class ConnectionManager { 
	static Connection con; 
	static String url; 
	public static Connection getConnection() throws SQLException { 
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		String url = "jdbc:mysql://localhost:3306/practice"; 
		// assuming "DataSource" is your DataSource name 
		//Class.forName("com.mysql.jdbc.Driver()"); 
		try { 
			con = DriverManager.getConnection(url,"root","root"); 
			// assuming your SQL Server's username is "username" // and password is "password" 
		} 
		catch (SQLException ex) { 
			ex.printStackTrace(); 
		} 
		return con; 
	} 
}