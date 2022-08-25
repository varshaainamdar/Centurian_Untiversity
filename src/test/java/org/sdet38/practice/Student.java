package org.sdet38.practice;

import org.testng.annotations.Test;

public class Student{
	@Test(priority=3)
	public void createStudentTest()
	{
		System.out.println("create student details");
	}
	
	@Test(priority =-1)
	public void modifyStudentTest()
	{
		System.out.println("modify studentdetails");
	}
	
	@Test(priority=1)
	public void deleteStudentTest()
	{
		System.out.println("delete student details");
	}
}
