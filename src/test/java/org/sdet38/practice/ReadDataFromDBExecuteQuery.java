package org.sdet38.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDBExecuteQuery {

	public static void main(String[] args) throws SQLException {
		//step1: create a obj for Driver
		Driver driverRef=new Driver();
		Connection con =null;
		
		//step2:register the driver
		DriverManager.registerDriver(driverRef);

		//step3:establish the connection-provide database name
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission_system","root","root");
		
		//step4: create a statement 
		  
		Statement statement = con.createStatement();
		
		//step5:Execute the query-provide table name
		
		String query = "select * from stddetails;";
		String expData = "varsha";
		ResultSet result = statement.executeQuery(query);
		 boolean flag = false;
		 while(result.next())
			 
		 {
			 String actData = result.getString(2);
			 if(actData.equalsIgnoreCase(expData))
			 {
				 System.out.println(actData);
				 flag=true;//flag rising
				 break;
			 }
		 }
		 if(flag)
		 {
			 System.out.println("data is present");
		 }
		 else
		 {
			 System.out.println("data is not present");
		 }
		
          
	}

}
