package com.OnlineAdimissionSystem.comcat.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmitDocumentPage {
	WebDriver driver;
	public SubmitDocumentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 @FindBy(xpath="//input[@id='dec']")
 private WebElement submitEdit;
 
 
public WebElement getSubmitEdit() {
	return submitEdit;
}
 public void submitbutton()
 {
	 submitEdit.click();
	 
}
}
 
 

