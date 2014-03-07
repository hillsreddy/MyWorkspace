//Database connection
//package connection.pool;
import java.sql.*;
public class DBUtil{
	static Connection con;
	public void connect() throws Exception{
	
		//step-1: register the driver
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		//step-2: get the connection from dbserver
		//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vissu","reddy");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
	}
}