//Searching emp records using eno 
//package org.students;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SearchEmpServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		try{
			String eno = request.getParameter("eno");
			
			EmpBean eb = new EmpBean();
			ArrayList al = eb.searchRecord(eno);
			
			request.setAttribute("al",al);
			
			RequestDispatcher rd = request.getRequestDispatcher("empdata.jsp");
			rd.forward(request,response);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}