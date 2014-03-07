//searching records using eno
//package org.students;
import java.io.*;
import java.sql.*;
import java.util.*;
//import connection.pool.*;

public class EmpBean {
	public ArrayList searchRecord(String eno) {
		
		PreparedStatement pstmt = null;
		DBUtil db = new DBUtil();
		ArrayList al = new ArrayList();
		try {
			db.connect();
			if(eno.equals("")){
				pstmt = db.con.prepareStatement("select * from emp");
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					Emp e = new Emp();
					e.setEno(rs.getString("eno"));
					e.setEname(rs.getString("ename"));
					e.setSalary(rs.getInt("salary"));
					al.add(e);
				}
			}
			else if (eno.equals(eno)){
				pstmt = db.con.prepareStatement("select * from emp where eno=?");
				pstmt.setString(1,eno);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					Emp e = new Emp();
					e.setEname(rs.getString("ename"));
					e.setEno(rs.getString("eno"));
					e.setSalary(rs.getInt("salary"));
					al.add(e);	
				}
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			//db.closeConnection(pstmt,db.con);
		}
		return al;
	}
}
 