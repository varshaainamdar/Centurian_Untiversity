package com.onlineAdmissionSystem.comcast.genericutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryImpclass implements IRetryAnalyzer {
 int counter =0;
 int retrylimit = 4;
 
 public boolean retry(ITestResult result)
 {
	 if(counter<retrylimit)
	 {
		counter++;
		return true;
	 }
	 return false;
 }
 
}
