package xpath;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement5 {

	public static void main(String[] args) {
		 WebDriver driver = null;
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("file:///C:/Users/LENOVO/Desktop/table.html");
		 String expres = "msg2";
		  boolean flag = false;
		  int rowCount=0;
		 List<WebElement>list = driver.findElements(By.xpath("//table[@id='tab1']/tbody/tr[*]/td[2]/*"));
        
		 for(WebElement wb: list)
         {
			 rowCount++;
        	    String actres = wb.getText();
          if(actres.equals(expres))
        	  
{
        	  driver.findElement(By.xpath("//table[@id='tab1']/tbody/tr["+rowCount+"]/td[1]/input"));
        	  driver.findElement(By.xpath("/table[@id='tab1']/tbody/tr["+rowCount+"]/td/a[text()='delete']")).click();
	System.out.println("test case is pass");
	flag = true;
	break;
}
         
         
         }
		 if(!flag)
		 {
			 System.out.println("testcase is failed ");
			 
		 }
	
	}

}
