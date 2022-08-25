package com.OnlineAdimissionSystem.comcat.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyUploadDocumentPage {
	WebDriver driver;
	
public VerifyUploadDocumentPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver = driver;
}
	

@FindBy(id="fpic")
private WebElement passimg;

@FindBy(id="ftndoc")
private WebElement tendocmark;

@FindBy(id="fdcdoc")
private WebElement twdocmark;

@FindBy(id="fide")
private WebElement idproof;

@FindBy(id="fsig")
private WebElement signproof;

public WebDriver getDriver() {
	return driver;
}

public WebElement getPassimg() {
	return passimg;
}

public WebElement getTendocmark() {
	return tendocmark;
}

public WebElement getTwdocmark() {
	return twdocmark;
}

public WebElement getIdproof() {
	return idproof;
}

public WebElement getSignproof() {
	return signproof;
}
public void passport( String passportimage)
{
	passimg.sendKeys(passportimage);
}
public void tenthmarksheet(String marksheet)
{
	tendocmark.sendKeys(marksheet);
}
public void twelethmarksheet(String marksheet1)
{
	twdocmark.sendKeys(marksheet1);
}
public void idproofdocument(String id)
{
	idproof.sendKeys(id);	
}
public void signproofdocument(String sign) {
	signproof.sendKeys(sign);
}
}
