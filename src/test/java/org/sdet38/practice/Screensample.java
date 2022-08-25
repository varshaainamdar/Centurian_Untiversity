package org.sdet38.practice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.onlineAdmissionSystem.comcast.genericutility.BaseClass;

import dummyproject.softassert1;

@Listeners(com.onlineAdmissionSystem.comcast.genericutility.LisImpClass.class)

public class Screensample extends BaseClass 
	{
		@Test
		public void create()
		{
			System.out.println("****create test*****");
		
			System.out.println("*****delete test***");
			//SoftAssert assert1 = new SoftAssert();
		//	 assert1.assertEquals(true,false);
		//	assert1.assertAll();
			 
			 Assert.assertEquals(true, false);
		}
		
	}

	


