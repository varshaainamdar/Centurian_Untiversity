package org.sdet38.practice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import com.onlineAdmissionSystem.comcast.genericutility.BaseClass;

public class SampleTest1  extends BaseClass{
	@Test(retryAnalyzer = com.onlineAdmissionSystem.comcast.genericutility.ReTryImpclass.class)
	public  void amazontest() throws IOException
	{
		Assert.assertEquals("a", "b");
	}
	

}
