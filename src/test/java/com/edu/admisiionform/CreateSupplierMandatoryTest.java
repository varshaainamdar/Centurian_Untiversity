package com.edu.admisiionform;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateSupplierMandatoryTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;

		
		//step1: read the necessary common data
		FileInputStream fis = new FileInputStream(".\\Data\\commanData.properties");
       Properties prop=new Properties();
       prop.load(fis);
       String URL=prop.getProperty("url");
       String username = prop.getProperty("username");
       String password = prop.getProperty("password");
       String Browser=prop.getProperty("browser");
       String ph=prop.getProperty("phonno");
       String mobno=prop.getProperty("mobno");
       
       
       //step2:read the test data from excel sheet
       FileInputStream fileExcel= new FileInputStream(".\\Data\\testdata.xlsx");
       Workbook wb = WorkbookFactory.create(fileExcel);
      String upload = wb.getSheet("sheet1").getRow(4).getCell(2).getStringCellValue();
      
      //Step3 :Launch the browser   ....run time polymorphism
      
       if(Browser.equalsIgnoreCase("chrome"))
       {
    	   WebDriverManager.chromedriver().setup();
    	   driver =new ChromeDriver();
       }else if(Browser.equalsIgnoreCase("Firefox"))
       {
    	   WebDriverManager.firefoxdriver().setup();
    	   driver =new FirefoxDriver();
       	   
       }
       else
       {
    	   System.out.println("Incorrect Browser");
    	   
       }
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(URL);
        
        //step4: login to app
        
        driver.findElement(By.id("u_id")).sendKeys(username);
        driver.findElement(By.id("u_ps")).sendKeys(password);
        driver.findElement(By.name("u_sub")).click();
        driver.findElement(By.id("uphn1")).sendKeys(ph);
        driver.findElement(By.id("uphn2")).sendKeys(mobno);
        driver.findElement(By.id("ufname")).sendKeys("ashok");
        driver.findElement(By.id("ufocc")).sendKeys("doctor");
        driver.findElement(By.id("ufphn")).sendKeys("9876543212");
        driver.findElement(By.id("umname")).sendKeys("jyoti");
        driver.findElement(By.id("umocc")).sendKeys("housewife");
        driver.findElement(By.id("umphn")).sendKeys("9876564345");
        driver.findElement(By.id("inc")).sendKeys("1000000");
        driver.findElement(By.id("gen")).click();
        driver.findElement(By.id("cadr")).sendKeys("purvasunflower");
        driver.findElement(By.id("cast")).sendKeys("karnataka");
        driver.findElement(By.id("capin")).sendKeys("560023");
        driver.findElement(By.id("camob")).sendKeys("9876543123");
        driver.findElement(By.id("padr")).sendKeys("purvasunflower");
        driver.findElement(By.id("past")).sendKeys("karnataka");
        driver.findElement(By.id("papin")).sendKeys("413004");
        driver.findElement(By.id("pamob")).sendKeys("987654312");
        driver.findElement(By.id("rur")).click();
        driver.findElement(By.id("cat")).click();
        driver.findElement(By.id("natn")).sendKeys("indian");
        driver.findElement(By.id("oaroll")).sendKeys("3");
        driver.findElement(By.id("relg")).sendKeys("hindu");
        driver.findElement(By.id("oarank")).sendKeys("45");
        driver.findElement(By.id("oabrn")).sendKeys("computer science");
        driver.findElement(By.id("pcm")).sendKeys("98");
        driver.findElement(By.id("nob1")).sendKeys("centurian university");
        driver.findElement(By.id("yop1")).sendKeys("2009");
        driver.findElement(By.id("tm1")).sendKeys("900");
        driver.findElement(By.id("mo1")).sendKeys("765");
        driver.findElement(By.id("divs1")).sendKeys("b");
        driver.findElement(By.id("pom1")).sendKeys("87");
        driver.findElement(By.id("nob2")).sendKeys("centurian university");
        driver.findElement(By.id("yop2")).sendKeys("2009");
        driver.findElement(By.id("tm2")).sendKeys("900");
        driver.findElement(By.id("mo2")).sendKeys("775");
        driver.findElement(By.id("divs2")).sendKeys("b");
        driver.findElement(By.id("pom2")).sendKeys("87");
      driver.findElement(By.id("moi")).click();
       driver.findElement(By.id("pay")).click();
        driver.findElement(By.id("frmnext")).click();
       driver.findElement(By.id("fpic")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
    	  driver.findElement(By.id("ftndoc")).sendKeys("C:\\Users\\LENOVO\\Downloads\\agile.docx."); 
    	  driver.findElement(By.id("ftcdoc")).sendKeys("C:\\Users\\LENOVO\\Desktop\\requirements\\create accoutn.docx");
   
	}

}

