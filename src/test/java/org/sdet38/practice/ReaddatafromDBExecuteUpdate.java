package org.sdet38.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReaddatafromDBExecuteUpdate {

	public static void main(String[] args) throws SQLException {
		//step1:create object for driver
		Driver driverRef= new Driver();
		Connection con=null;
		
		//step2 : Register the Driver 
		DriverManager.registerDriver(driverRef);
		
		//step3: Establish the connection -provide database name 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission_system","root","root");
		
		//step4 :create a statement
		Statement state = con.createStatement();
		
				//step5 :execute the query
		String query = "insert into stddetails values(11,'varsha',97,'bangalore')";
		String query1 ="insert into stddetails values(12,'neha',98,'bangalore')";
		      int result = state.executeUpdate(query1);
		      System.out.println(result);
		      
		      //step6:validate
		      if(result==2)
		      {
		    	  System.out.println("data is updated ");
		      }
		      else 
		      {
		    	  System.out.println("data is not added");
		    	  
		      }
     con.close();
     System.out.println("connection closed");
	}

}
