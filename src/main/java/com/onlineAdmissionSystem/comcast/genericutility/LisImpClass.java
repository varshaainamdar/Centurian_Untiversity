package com.onlineAdmissionSystem.comcast.genericutility;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImpClass implements ITestListener{
	public void onTestFailure(ITestResult result)
	{
		 String testName = result.getMethod().getMethodName();
		 System.out.println(testName);
		 JavaUtiity j=new JavaUtiity();
		 String date = j.getSystemDate();
		 int ran = j.getRanDomNumber();
		 EventFiringWebDriver eDriver= new EventFiringWebDriver(BaseClass.sdriver);
		 File src = eDriver.getScreenshotAs(OutputType.FILE);
		 File des=new File(".\\screenshot\\"+testName+""+date+ran+".png");
		 try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
