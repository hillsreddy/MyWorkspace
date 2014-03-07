/**
 * 
 */
package com.getrecords.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Kondal Reddy
 *
 */
public class DBConnection {
	public static Connection getConnection() throws SQLException{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
	}
}
