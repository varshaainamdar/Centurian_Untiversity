package com.OnlineAdimissionSystem.comcat.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign Up ']")
	private WebElement SignUp;

	@FindBy(id = "u_id")
	private WebElement usernameEdit;

	@FindBy(id = "u_ps")
	private WebElement passwordEdit;

	@FindBy(id = "u_sub")
	private WebElement Loginbtn;

	// business

	public WebElement getSignUp() {
		return SignUp;
	}

	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	public void Login(String username, String password) {
		usernameEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		//Loginbtn.click();
	}

}
