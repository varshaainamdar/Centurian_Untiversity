package com.edu.admisiionform;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifyassert {
	@Test
	public void createsteps()
	{
		System.out.println("*****step1*****");
		System.out.println("******step2*****");
		Assert.assertEquals("a", "b");
		System.out.println("*****step3*****");
		System.out.println("******step4*****");
	}
@Test
public void deletesteps()
{
	System.out.println("******delete steps1****");
	System.out.println("******delete step2****");
	System.out.println("*****delete step3******");
	System.out.println("******delete steps4****");

}
}
