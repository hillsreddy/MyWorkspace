/**
 * 
 */
package com.getrecords;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.getrecords.connection.DBConnection;

/**
 * @author dell
 *
 */
public class LoginAuthentication {
	public static String authenticate(String un,String pw)throws SQLException{
		PreparedStatement ps = DBConnection.getConnection().prepareStatement("select * from login where username=? and password=?");
		ps.setString(1,un);
		ps.setString(2,pw);
		//System.out.println("login servlet un in db  "+un);
		//System.out.println("login servlet pw in db  "+pw);
		ResultSet rs = ps.executeQuery();
		//RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/Form.html");
		//rd.include(request,response);
		if(rs.next() && !(un.equals("") && pw.equals(""))){
			return "You are logged in Successfully";
			
		} 
		else{
			return "Invalid username/password";
		}
	}

}
