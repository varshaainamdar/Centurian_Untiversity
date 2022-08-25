package org.sdet38.practice;

import org.testng.annotations.Test;

import com.onlineAdmissionSystem.comcast.genericutility.BaseClass;

public class Customer {
@Test
public void createCustomerTest()
{
	System.out.println("execute HDFC create customer Test");
	int arr[]= {1,2,3};
	System.out.println(arr[2]);
}
@Test(dependsOnMethods="createCustomerTest")

	public void modifyCustomerTest() {
		System.out.println("execute modify HDFC to Airtel Customer Test");
}

@Test(dependsOnMethods="modifyCustomerTest")
public void deleteCustomerTest()
{
	System.out.println("execute delete Airtel Customer");
}
}

