package xpath;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic {

	public static void main(String[] args) {
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();		
	  driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("http://192.168.0.190:8888/index.php?module=Accounts&action=index");
	 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();

		 
	java.util.List<WebElement> count = driver.findElements(By.xpath("//a[text()='Organization No']/ancestor::div/descendant::input[@type='checkbox']"));
	            System.out.println("Row count ==>" +count.size());
	           
	            
	       
                //  java.util.List<WebElement> count1 = driver.findElements(By.xpath("//a[text()='Organization Name']/ancestor::tbody[1]/descendant::a[text()='ola']"));
                  
                 
	        java.util.List<WebElement> count1 = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[1]/td[*]"));
	          
	          System.out.println("column count==>" +count1.size());
	          driver.findElement(By.xpath("//td[contains(text(),'ACC3')]/ancestor::tr[@class='lvtColData']/descendant::input[@type='checkbox']")).click();
	
	}
	

}
