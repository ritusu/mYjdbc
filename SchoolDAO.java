package com.lti.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lti.training.jdbc.School;


public class SchoolDAO {

	public void add(School sch) {
	
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Establish connection with the Database
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			String sql="insert into TBL_SCHOOL values(?,?,?,?,?)";
			stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1,sch.getRollno());
			stmt.setString(2,sch.getFname());
			stmt.setString(3,sch.getLname());
			stmt.setString(4,sch.getCourse());
			stmt.setString(5,sch.getResult());
			
			rs = stmt.executeQuery();
		
		}	catch (ClassNotFoundException e) {
			System.out.println("JDBC driver not found");
			//throw new DataAccessException("Unable to load the JDBC");
			
		}
		catch(SQLException e) {
				
				e.printStackTrace();
			//throw new DataAccessException("Problem while fetching Products from DataBase",e);
		}
		finally {
			try { conn.close(); } catch(Exception e) {  }
		
			}
  }
}
