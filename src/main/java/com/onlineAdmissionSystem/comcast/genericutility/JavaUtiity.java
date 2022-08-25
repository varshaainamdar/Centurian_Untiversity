package com.onlineAdmissionSystem.comcast.genericutility;

import java.util.Date;
import java.util.Random;


/**
 *  its contains java specific libraries like getRandondata and getSystemDate etc
 *  
 * @author varsha
 *
 */
public class JavaUtiity {
	/**
	 * its used to generate the random number with in the range of 10000
	 * @return
	 */
	public static int getRanDomNumber()
	{
		Random ranDom = new Random();
		int ranDomNum=ranDom.nextInt(10000);
		return ranDomNum;
	}
 /**
  * it is used to generate the current system date based on YYYY-MM-DD format
  * @return
  */
	public String getSystemDate()
	{
		Date date = new Date();
		String currentDate=date.toString();

		System.out.println(currentDate);
		String[]arr=currentDate.split("");
		String yyyy=arr[5];
		String dd =arr[2];
		int mm = date.getMonth()+1;
		   
		      String format = yyyy+"-"+mm+"-"+dd;
		      return format;
		
	}
	/**
	 * it is used to get the current system date based on DD-MM-YYYY format
	 * @return
	 */
	public String getSystemDateInIst() {
		Date date = new Date();
		String currentDate=date.toString();
		System.out.println(currentDate);
		String[]arr=currentDate.split("");
		
		String yyyy =arr[5];
		String add = arr[2];
		int mm = date.getMonth()+1;
		   
		     String dd = null;
			String format =dd+"-"+mm+"-"+yyyy;
		     return format;
	}
	
	
}
