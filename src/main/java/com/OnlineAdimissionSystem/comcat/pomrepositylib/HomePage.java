package com.OnlineAdimissionSystem.comcat.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		

	}
	 @FindBy(xpath="//a[text()='Sign Up ']")
     private WebElement SignUp;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignUp() {
		return SignUp;
	}

public void signpage()
{
	SignUp.click();
}
}
