package xpath;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {

	public static void main(String[] args) {
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.goibibo.com");
		Actions act = new Actions(driver);
	 act.moveByOffset(10, 10).click().perform();

	//driver.findElement(By.xpath("//p[text()='Enter city or airport']/ancestor::div[@class='sc-bkkeKt gAqCbJ fswFld ']/descendant::span[text()='From']")).sendKeys("Banglore");
	// driver.findElement(By.xpath("//p[text()='Enter city or airport']/ancestor::div[@class='sc-bkkeKt gAqCbJ fswFld ']/descendant::span[text()='To']")).sendKeys("pune");
     driver.findElement(By.xpath("//span[text()='Departure']")).click();
     String arrowXpath = "//span[@aria-label='Next Month'";  

	String dateXpath = "//div[@aria-label='Thu Oct 13 2022']";

	   String arrowXpath1 = "//span[@aria-label='Previous Month']";

	String dateXpath1="//div[@aria-label='Thu Sep 15 2022']";
	         driver.findElement(By.xpath("//div[contains(text(),'August 2022')]/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='19']")).click();
  driver.findElement(By.xpath("//span[text()='Done']"));
	for(;;) {
		try {
			driver.findElement(By.xpath(dateXpath1)).click();
			break;
		}
		catch(Exception e) {
			driver.findElement(By.xpath(arrowXpath1)).click();
	}
	}

}
}


