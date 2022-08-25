package dummyproject;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert1 {
	@Test
	public void softass()
	{
		System.out.println("create step1");
		System.out.println("create step2");
		System.out.println("create step3");
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals("a","b");
		System.out.println("create steps4");
		assert1.assertEquals("x", "y");
		System.out.println("create steps5");
		assert1.assertAll();
	}
	@Test
	public void createtest()
	{
		System.out.println("create test1");
		System.out.println("create test2");
		System.out.println("create test3");
	}

}
