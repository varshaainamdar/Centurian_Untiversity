package com.OnlineAdimissionSystem.comcat.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class FetchUserIdPassword {
	WebDriver driver;
	public FetchUserIdPassword(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//font")
	WebElement font;

	@FindBy(xpath ="//input[@value='Login']")
	WebElement login;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFont() {
		return font;
	}

	public WebElement getLogin() {
		return login;
	}


	public void fetch(WebDriver driver, String getfont) {
		font.getText();
		login.click();
	}
}







