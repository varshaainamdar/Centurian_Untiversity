package org.sdet38.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestdataProvider {
@Test(dataProvider="bookTicketDataProvieder")
	
	
public void bookTicket(String src, String dst, int ticket) {
	System.out.println("execute soure =>" +src+ ", Destination==>"+dst);
	}
@DataProvider
public Object[][] bookTicketDataProvider(){
	Object[][] objArr=new Object[5][3];
	objArr[0][0]="Banglore";
	objArr[0][1]="pune";
	objArr[0][2]=10;
	
	objArr[1][0]="Banglore";
	objArr[1][1]="Muysore";
	objArr[1][2]=20;
	
	objArr[2][0]="Banglore";
	objArr[2][1]="Chennai";
	objArr[2][2]=20;
	
	objArr[3][0]="Banglore";
	objArr[3][1]="Goa";
	objArr[3][2]=30;
	
	objArr[4][0]="Banglore";
	objArr[4][1]="hydrabad";
	objArr[4][2]=40;
	return objArr;
	
}
}
