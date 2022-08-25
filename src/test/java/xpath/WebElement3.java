package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement3 {

	public static void main(String[] args) {
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/LENOVO/Desktop/table.html");
		List<WebElement> count = driver.findElements(By.xpath("//table[@id='tab1']/tbody/tr[*]/td[2]"));
              count.size();
              for(WebElement wb : count)
              {
            	 String list = wb.getText();
            	  System.out.println(list);
              }
            
		
	} 

}
