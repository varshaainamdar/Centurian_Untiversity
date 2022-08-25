package org.sdet38.practice;

import org.testng.annotations.Test;

public class BankSendAmountTest{
	@Test(invocationCount=4)
	public void sendAmount() {
		System.out.println("execute the send amount test");
	}
	

}
