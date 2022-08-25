package com.OnlineAdimissionSystem.comcat.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.onlineAdmissionSystem.comcast.genericutility.ExcelUtility;
import com.onlineAdmissionSystem.comcast.genericutility.FileUtility;
import com.onlineAdmissionSystem.comcast.genericutility.JavaUtiity;
import com.onlineAdmissionSystem.comcast.genericutility.WebDriverUtlity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnlineAdmissionBusinessLib {

	public static void main(String[] args) throws Throwable {
		//create objects
		WebDriver driver=null;
		  FileUtility flib = new FileUtility();
		  WebDriverUtlity wlib= new WebDriverUtlity();
		  JavaUtiity jlib  = new JavaUtiity();
		  ExcelUtility elib = new ExcelUtility();
		  
		  //read the common data
		  String URL=flib.getPropertyKeyValue("url");
		 	
			String Browser=flib.getPropertyKeyValue("browser");
			String Name1=flib.getPropertyKeyValue("Name");
			String Date=flib.getPropertyKeyValue("Date");
			String Mobile=flib.getPropertyKeyValue("mobile");
			String Emailid=flib.getPropertyKeyValue("Email");
			String Capt=flib.getPropertyKeyValue("Captcha");       
			String username = flib.getPropertyKeyValue("username");
			String password = flib.getPropertyKeyValue("password");

			//launch the browser

			if(Browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver =new ChromeDriver();
			}else if(Browser.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver =new FirefoxDriver();

			}
			else
			{
				System.out.println("Incorrect Browser");

			}
			wlib.waitForElementInDOM(driver);
            driver.get(URL);
				 
           // welcome page
            
            HomePage hp = new HomePage(driver);
            		hp.signpage();
            		
           // register the account
            SignUP s = new SignUP(driver);
            		s.getName();
            		s.getDOB();
            		s.getEmail();
            		s.getMobNo();
            		s.getCaptcha();
            	
            //fetching the account
            		FetchUserIdPassword fet = new FetchUserIdPassword(driver);
            		fet.fetch(driver, password);
            		
           //Login to the App
            LoginPage lg = new LoginPage(driver);
            lg.Login(username, password);
            		
            
            		
                 
            		
            		
		
	
		
		
		

	}

}
