
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class LoginServlet extends GenericServlet{
	public void service(ServletRequest request,ServletResponse response) throws IOException{
		try{
		System.out.println("#############");
		LoginManager lm = new LoginManager();
		String un = request.getParameter("uname");
		String pw = request.getParameter("pwd");
		String str = lm.authenticate(un,pw);
		PrintWriter out = response.getWriter();
		//System.out.println("login servlet un "+un);
		//System.out.println("login servlet pw "+pw);
		out.print(str);
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
}