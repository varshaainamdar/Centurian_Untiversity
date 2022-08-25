package org.sdet38.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTicket {
	@Test(dataProvider = "dataProvider_bookTicketTest")
	public void bookTicketTest(String src, String dst)
	{
		System.out.println("book the ticket from "+src  +dst);
	}
	
	@DataProvider	
	public Object[][] dataProvider_bookTicketTest(){
		Object[][] objArr=new Object[5][2];
		
		objArr[0][0]="Banglore";
		objArr[0][1]="pune";
		
		objArr[1][0]="Banglore";
		objArr[1][1]="Mumbai";
		
		objArr[2][0]="Banglore";
		objArr[2][1]="Goa";
		
		objArr[3][0]="Banglore";
		objArr[3][1]="Hydrabad";
		
		objArr[4][0]="Banglore";
		objArr[4][1]="Delhi";
		
		
		return objArr;
		
		
		
	}
	

}
