package org.sdet38.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchDataFromDatabasePractice {

	public static void main(String[] args) throws SQLException {
		//create a object DB driver class
		Driver dbDriver = new Driver();
		//register the driver to the jdbc
		
		DriverManager.registerDriver(dbDriver);
		Connection connection=null;
		try {
		//get ot establish the connection
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/admission_system","root","root");
		
		//create the statement
		Statement statement = connection.createStatement();
		//execute the query
		statement.executeUpdate("create table stdDetails(stdId int(4) not null unique,stdName varchar(30),marks int(10) not null unique,address varchar(50));");
		System.out.println("data updated sucessfully");
	
	}
finally {
	//close the applicaton
	connection.close();
	System.out.println("connection closed");
	}
		
	}

}
