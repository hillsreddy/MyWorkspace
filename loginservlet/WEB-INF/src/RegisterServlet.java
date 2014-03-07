import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RegisterServlet extends GenericServlet{
	public void service(ServletRequest request,ServletResponse response) throws IOException{
		try{
			LoginManager lm = new LoginManager();
			
			String un = request.getParameter("uname");
			String pw = request.getParameter("pwd");
			String rpwd = request.getParameter("repwd");
			String sex = request.getParameter("gender");
			String area = request.getParameter("location");
			
			/*System.out.println("register servlet un  "+un);
			System.out.println("register servlet pw  "+pw);
			System.out.println("register servlet rpwd  "+rpwd);
			System.out.println("register servlet sex  "+sex);
			System.out.println("register servlet area  "+area);*/
			
			String str = lm.register(un,pw,rpwd,sex,area);
			PrintWriter out = response.getWriter();
			out.println("<a href = \"signin.html\">Sign In here</a>");
			out.print(str);
			
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
}