package dummyproject;

import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class Createform {
	@Test(groups= {"smokeTest"})
	public void registerform()
	{
		System.out.println("eneter all valid details of student");
	}
 @Test(groups= {"regressionTest"})
 public void fatherdetails()
 { System.out.println("eneter father name");
	 
 }
 @Test(groups={"smokeTest"})
 public void motherdetails()
 {
	 System.out.println("enter mother details");
 }
}
