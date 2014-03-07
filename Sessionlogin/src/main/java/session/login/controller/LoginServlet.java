/**
 * 
 */
package session.login.controller;

/**
 * @author Home
 *
 */
import java.io.IOException; 

import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession;

import session.login.dao.UserBean;
import session.login.dao.UserDAO;
 /** * Servlet implementation class LoginServlet */ 
 public class LoginServlet extends HttpServlet { 
	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
			 	throws ServletException,IOException { 
		 try { 
			 UserBean user = new UserBean(); 
			 user.setUserName(request.getParameter("un")); 
			 user.setPassword(request.getParameter("pw")); 
			 user = UserDAO.login(user); 
			 if (user.isValid()) { 
				 HttpSession session = request.getSession(true); 
				 session.setAttribute("currentSessionUser",user); 
				 response.sendRedirect("/WEB-INF/pages/userLogged.jsp"); 
				 //logged-in page 
				 } 
			 else 
				 response.sendRedirect("/WEB-INF/pages/invalidLogin.jsp"); 
				 //error page 
			 } 
		catch (Throwable theException) { 
			 System.out.println(theException); 
		 } 
	 } 
 }
