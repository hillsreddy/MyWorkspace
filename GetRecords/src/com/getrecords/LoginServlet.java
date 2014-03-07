package com.getrecords;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.getrecords.dto.Login;

/**
 * Servlet implementation class Login
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String loginInfo;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		//ServletContext application = getServletContext();
		//Login login = new Login();
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		try {
			loginInfo = LoginAuthentication.authenticate(email, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*if(email.equalsIgnoreCase(login.getEmail()) && pwd.equals(login.getPassword())){
			loginInfo = "Login success";
		}
		else{
			loginInfo ="Login failure";
		}*/
		/*session.setAttribute("email", email);
		session.setAttribute("pwd", pwd);
		session.setAttribute("loginInfo", loginInfo);*/
		request.setAttribute("email", email);
		request.setAttribute("pwd", pwd);
		request.setAttribute("loginInfo", loginInfo);
		out.print(loginInfo);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/pages/success.jsp");
		rd.forward(request, response);
		
	}

}
