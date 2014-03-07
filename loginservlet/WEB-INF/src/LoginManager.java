import javax.servlet.*;
import java.sql.*;
public class LoginManager  {
	Connection con=null;
	String str;
	int a;
	LoginManager(){
		try{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		System.out.println("Connected to Database");
		}
		catch(SQLException se){
			System.out.println("Failed to connect to the database");
		}
	}
	public  String authenticate(String un,String pw)throws SQLException{
		PreparedStatement ps = con.prepareStatement("select * from login where username=? and password=?");
		ps.setString(1,un);
		ps.setString(2,pw);
		System.out.println("login servlet un in db  "+un);
		System.out.println("login servlet pw in db  "+pw);
		ResultSet rs = ps.executeQuery();
		System.out.println("rs  "+rs);
		//RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/Form.html");
		//rd.include(request,response);
		if(rs.next()){
			return "You are logged in Successfully";
			
		} 
		else{
			return "Invalid username/password";
		}
	}
	public String register(String un,String pw,String rpwd,String sex,String area)throws SQLException{
		PreparedStatement regps = con.prepareStatement("insert into login values(?,?,?,?,?)");
		regps.setString(1,un);
		regps.setString(2,pw);
		regps.setString(3,rpwd);
		regps.setString(4,sex);
		regps.setString(5,area);
		
		//System.out.println("register servlet un in db "+un);
		//System.out.println("register servlet pw in db "+pw);
		//System.out.println("register servlet rpwd in db "+rpwd);
		//System.out.println("register servlet sex in db "+sex);
		//System.out.println("register servlet area in db "+area);
		
		if(pw.equals(rpwd)){
			a =regps.executeUpdate();
			str = "Account created Successfully";
			System.out.println(a);
		}
		else{
			str = "Password and Confirm password are mismatched";
			System.out.println(a);
		}
		System.out.println(a);
		return str;
	}
}