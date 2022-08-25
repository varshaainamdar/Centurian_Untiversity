package com.onlineAdmissionSystem.comcast.genericutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.OnlineAdimissionSystem.comcat.pomrepositylib.FetchUserIdPassword;
import com.OnlineAdimissionSystem.comcat.pomrepositylib.HomePage;
import com.OnlineAdimissionSystem.comcat.pomrepositylib.LoginPage;
import com.OnlineAdimissionSystem.comcat.pomrepositylib.SignUP;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver sdriver;

	public WebDriver driver;
	

	//object crieation for Lib
	public JavaUtiity  jlib=new JavaUtiity();
	public WebDriverUtlity wlib=  new WebDriverUtlity();
	public FileUtility flib = new FileUtility();
	public ExcelUtility elib = new ExcelUtility();	
	

	@BeforeSuite
	public void configBS()
	{
		System.out.println("**********connect  to DB********");
	}

//@Parameters("BROWSER")
	@BeforeClass

	public void configBC() throws Throwable
	{
		String BROWSER=flib.getPropertyKeyValue("Browser");
		System.out.println("*********Launch the browser*********");
		
		//driver = new ChromeDriver();
		//wlib.waitForElementInDOM(driver);
		//driver.manage().window().maximize();
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
		}else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();

		}
		else
		{
			System.out.println("Incorrect Browser");

		}
		
		wlib.waitForElementInDOM(driver);
		driver.manage().window().maximize();
		sdriver=driver;

	}

	@BeforeMethod

	public void configBM() throws Throwable
	{
		int ran = jlib.getRanDomNumber();	
		//common data
		String URL=flib.getPropertyKeyValue("url");

		//String Browser=flib.getPropertyKeyValue("browser");
		String Name1=flib.getPropertyKeyValue("Name");
		String Date=flib.getPropertyKeyValue("Date");
		String Mobile=flib.getPropertyKeyValue("mobile");
		String Emailid=flib.getPropertyKeyValue("Email")+ran+"@gmail.com";
		String Capt=flib.getPropertyKeyValue("Captcha");       
		String username = flib.getPropertyKeyValue("username");
		String password = flib.getPropertyKeyValue("password");
		


		//navigate  to the App
		driver.get(URL);


		//step:---Signup
		HomePage hp = new HomePage(driver);
		hp.signpage();

		// register the account
		SignUP s = new SignUP(driver);
		s.SignUP(Name1, Date, Emailid, Mobile, Capt);
		

		//fetching the account
		String UserNamePass = driver.findElement(By.xpath("//font[contains(text(),'Your User ID is')]")).getText();
	String[] arr=UserNamePass.split(" ");
	String user_id=arr[4];
	String passwd=arr[8];
	

		FetchUserIdPassword fet = new FetchUserIdPassword(driver);
	fet.fetch(driver, password);
		

		//step:--  *Login
		LoginPage lg = new LoginPage(driver);
		lg.Login(user_id, passwd);
	}

	@AfterMethod
	public void configAM()
	{
	System.out.println("If you want to create another form then click on login again");
	

	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("********close the browser********");
		driver.quit();
	}
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("******close the DB******");
	}
	



}
