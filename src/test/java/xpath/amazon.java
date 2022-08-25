package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.amazon.in/s?k=iphone+13&crid=24F0C5OY37705&sprefix=iphone%2Caps%2C2179&ref=nb_sb_ss_ts-doa-p_1_1");
   //String pName = "Apple iPhone 13 (128GB) - Starlight";
   Thread.sleep(5000);
  String price = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[1]")).getText();
	System.out.println(price);
	}
 
}
