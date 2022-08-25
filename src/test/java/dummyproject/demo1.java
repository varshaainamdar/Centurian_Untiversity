package dummyproject;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {
	@Test
	public void createtest()
	{
		System.out.println("cretaetest1");
		System.out.println("createtest2");
		System.out.println("cretetest3");
		System.out.println("createtest4");
		Assert.assertNotEquals("a", "a");
		System.out.println("createtest5");
		
	}
	@Test
	public void createtest1()
	{
		System.out.println("****step1*****");
		System.out.println("****step2****");
	}

}
