package com.OnlineAdimissionSystem.comcat.pomrepositylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUP {
	WebDriver driver;
     public SignUP(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
    
     


	@FindBy(id="in_name")
     private WebElement NameEdit;
     
     @FindBy(id="in_dob")
     private WebElement DOB;
     
     @FindBy(id ="in_eml")
     private WebElement emailEdit;
     
     @FindBy(id="in_mob")
private WebElement MobNo;
     
     @FindBy(id="txt_captcha")
private  WebElement captcha;
     
     @FindBy(id="in_sub")
 private WebElement Signbth;

     public WebDriver getDriver() {
		return driver;
	}

	public WebElement getName() {
		return NameEdit;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getEmail() {
		return emailEdit;
		
	}

	public WebElement getMobNo() {
		return MobNo;
	}

	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getSignbth() {
		return Signbth;
	}
	
	public void SignUP(String Name,String Date,String email,String mobile,String Captcha )
	{
		NameEdit.sendKeys(Name);
		DOB.sendKeys(Date);
		emailEdit.sendKeys(email);
		MobNo.sendKeys(mobile);
		captcha.sendKeys(Captcha);
		Signbth.click();
		
		
		
		
	}
	
     
}
