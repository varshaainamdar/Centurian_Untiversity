package com.edu.admisiionform;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.onlineAdmissionSystem.comcast.genericutility.ExcelUtility;
import com.onlineAdmissionSystem.comcast.genericutility.FileUtility;
import com.onlineAdmissionSystem.comcast.genericutility.WebDriverUtlity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verify10thmarksheet {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=null;
	  FileUtility flib = new FileUtility();
	  WebDriverUtlity wlib= new WebDriverUtlity();
	  //wlib.waitForPage(driver, );


		//step1: read the necessary common data
		//FileInputStream fis = new FileInputStream(".\\Data\\commanData.properties");
		//Properties prop=new Properties();
		//prop.load(fis);
	 	String URL=flib.getPropertyKeyValue("url");
	 	
		String Browser=flib.getPropertyKeyValue("browser");
		String Name1=flib.getPropertyKeyValue("Name");
		String Date=flib.getPropertyKeyValue("Date");
		String Mobile=flib.getPropertyKeyValue("mobile");
		String Emailid=flib.getPropertyKeyValue("Email");
		//String code1=prop.getProperty("code");
		String Capt=flib.getPropertyKeyValue("Captcha");       
		String username = flib.getPropertyKeyValue("username");
		String password = flib.getPropertyKeyValue("password");



		//step2:read the test data from excel sheet

		
		
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
		wlib.waitForElementInDOM(driver);
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(URL);

		//step4: sign up 

		driver.findElement(By.xpath("//a[text()='Sign Up ']")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		driver.findElement(By.xpath("//input[@id='in_name']")).sendKeys(Name1);
		driver.findElement(By.id("in_dob")).sendKeys(Date);
		Random ram = new Random();
		int random=ram.nextInt(10000);
		driver.findElement(By.id("in_eml")).sendKeys(Emailid+random+"@gmail.com");
		driver.findElement(By.id("in_mob")).sendKeys(Mobile);
		driver.findElement(By.id("txt_captcha")).sendKeys(Capt);
		driver.findElement(By.id("in_sub")).click();
		String UserNamePass = driver.findElement(By.xpath("//font")).getText();
		driver.findElement(By.xpath("//input[@id='u_sub']")).click();

		String user_id=UserNamePass.substring(16,25);
		System.out.println(user_id);
		driver.findElement(By.id("u_id")).sendKeys(user_id);

		String pass=UserNamePass.substring(42,50);
		System.out.println(pass);
		driver.findElement(By.id("u_ps")).sendKeys(pass);

		driver.findElement(By.id("u_sub")).click();        



		//step4: login to app

		/*driver.findElement(By.id("u_id")).sendKeys(username);
        driver.findElement(By.id("u_ps")).sendKeys(password);
        driver.findElement(By.name("u_sub")).click();*/
		
		// read the data from excel
		
		ExcelUtility excel = new ExcelUtility();
		//mobile no
		
		String phone = excel.getExcelData("sheet1", 0, 1);			
		driver.findElement(By.id("uphn1")).sendKeys(phone);
		
		String Mob= excel.getExcelData("sheet1", 0, 2);
		driver.findElement(By.id("uphn2")).sendKeys(Mob);
		
		// fathername
		String fname=excel.getExcelData("sheet1", 1, 1);
		driver.findElement(By.id("ufname")).sendKeys(fname);
		
		
		//father's occupation
		String occup= excel.getExcelData("sheet1", 2, 1);
		driver.findElement(By.id("ufocc")).sendKeys(occup);
		
		
		//mobile no
		String Mob1 = excel.getExcelData("sheet1", 2, 3);
		driver.findElement(By.id("ufphn")).sendKeys(Mob1);
		
		
		//mother name
		String mname = excel.getExcelData("sheet1", 3, 1);
		driver.findElement(By.id("umname")).sendKeys(mname);
		
		//mother occupation
		String occup1 = excel.getExcelData("sheet1", 4, 1);
		driver.findElement(By.id("umocc")).sendKeys(occup1);
		
		//mother mobno
		String Mob2 = excel.getExcelData("sheet1", 4 , 3);
		driver.findElement(By.id("umphn")).sendKeys(Mob2);
		
		//parentincome
		String income = excel.getExcelData("sheet1", 5 , 1);
		driver.findElement(By.id("inc")).sendKeys(income);
		
		
		
		driver.findElement(By.id("gen")).click();
		
		//corresponding address
		String corres = excel.getExcelData("sheet1", 6, 1);
		driver.findElement(By.id("cadr")).sendKeys(corres);
		driver.findElement(By.id("cast")).sendKeys("karnataka");
		driver.findElement(By.id("capin")).sendKeys("560023");
		driver.findElement(By.id("camob")).sendKeys("9876543123");
		
		//permanant address
		String permanant = excel.getExcelData("sheet1", 6, 1);
		driver.findElement(By.id("padr")).sendKeys(permanant);
		driver.findElement(By.id("past")).sendKeys("karnataka");
		driver.findElement(By.id("papin")).sendKeys("413004");
		driver.findElement(By.id("pamob")).sendKeys("987654312");
		driver.findElement(By.id("rur")).click();
		driver.findElement(By.id("cat")).click();
		
		String nationality = excel.getExcelData("sheet1", 8, 1);
		driver.findElement(By.id("natn")).sendKeys(nationality);
		
		
		String rollno = excel.getExcelData("sheet1", 9 ,1);
		driver.findElement(By.id("oaroll")).sendKeys(rollno);
		
		String religion = excel.getExcelData("sheet1", 10, 1);
		driver.findElement(By.id("relg")).sendKeys(religion);
		
		
		//rank
		String rank = excel.getExcelData("sheet1", 11, 1);
		driver.findElement(By.id("oarank")).sendKeys(rank);
		
		//branch
		String branch = excel.getExcelData("sheet1", 12, 1);
		driver.findElement(By.id("oabrn")).sendKeys(branch);
		
		
		
		//percent
		String percent = excel.getExcelData("sheet1", 13 , 1);	
		driver.findElement(By.id("pcm")).sendKeys(percent);
		
		
		//university
		String university = excel.getExcelData("sheet1", 14, 1);
		driver.findElement(By.id("nob1")).sendKeys(university);
		
		
		//yrspass
		String yrpass = excel.getExcelData("sheet1", 15, 1);
		driver.findElement(By.id("yop1")).sendKeys(yrpass);
		
		//totalmarks
		String totalmarks = excel.getExcelData("sheet1", 16, 1);
		driver.findElement(By.id("tm1")).sendKeys(totalmarks);
		
		//marksobt
		String marksobt= excel.getExcelData("sheet1", 17, 1);
		driver.findElement(By.id("mo1")).sendKeys(marksobt);
		
		
		//division
		String division = excel.getExcelData("sheet1", 18, 1);
		driver.findElement(By.id("divs1")).sendKeys(division);
		
		
		//percentsge
		String percentage= excel.getExcelData("sheet1", 19, 1);
		driver.findElement(By.id("pom1")).sendKeys(percentage);
		
		//university1
		String university1 = excel.getExcelData("sheet1", 20, 1);
		driver.findElement(By.id("nob2")).sendKeys(university1);
		
		//yearpass1
		String yrpass1 = excel.getExcelData("sheet1", 21, 1);		
		driver.findElement(By.id("yop2")).sendKeys(yrpass1);
		
		//totalmarks1
		String totalmarks1 = excel.getExcelData("sheet1", 22, 1);
		driver.findElement(By.id("tm2")).sendKeys(totalmarks1);
		
		
		//marks1
		String marksobt1= excel.getExcelData("sheet1", 23, 1);
		driver.findElement(By.id("mo2")).sendKeys( marksobt1);
		
		//division
		String division1 = excel.getExcelData("sheet1", 24, 1);
		driver.findElement(By.id("divs2")).sendKeys(division1);

	
		//percentage1
		String percentage1= excel.getExcelData("sheet1", 25, 1);
		driver.findElement(By.id("pom2")).sendKeys(percentage1);
		
		
		
		/*FileInputStream fileExcel= new FileInputStream(".\\Data\\stdetails.xlsx");
		Workbook wb = WorkbookFactory.create(fileExcel);
		String phone = wb.getSheet("sheet1").getRow(0).getCell(1).toString();			
		driver.findElement(By.id("uphn1")).sendKeys(phone);
		
		String Mob = wb.getSheet("sheet1").getRow(0).getCell(2).toString();
		driver.findElement(By.id("uphn2")).sendKeys(Mob);
		
		//father name
		String fname = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("ufname")).sendKeys(fname);
		
		//father's occupation
		String occup = wb.getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
		driver.findElement(By.id("ufocc")).sendKeys(occup);
		
		//mobileno
		String Mob1 = wb.getSheet("sheet1").getRow(2).getCell(3).toString();
		driver.findElement(By.id("ufphn")).sendKeys(Mob1);
		
		//mother name
		String mname = wb.getSheet("sheet1").getRow(3).getCell(1).getStringCellValue();
		driver.findElement(By.id("umname")).sendKeys(mname);
		
		//mother occupation
		String occup1 = wb.getSheet("sheet1").getRow(4).getCell(1).getStringCellValue();
		driver.findElement(By.id("umocc")).sendKeys(occup1);
		
		//mother mobno
		String Mob2 = wb.getSheet("sheet1").getRow(4).getCell(3).toString();
		
		
		driver.findElement(By.id("umphn")).sendKeys(Mob2);
		
		//parentincome
		String income = wb.getSheet("sheet1").getRow(5).getCell(1).toString();
		driver.findElement(By.id("inc")).sendKeys(income);
		
		driver.findElement(By.id("gen")).click();
		
		//corresponding address
		String corres = wb.getSheet("sheet1").getRow(6).getCell(1).getStringCellValue();
		driver.findElement(By.id("cadr")).sendKeys(corres);
		driver.findElement(By.id("cast")).sendKeys("karnataka");
		driver.findElement(By.id("capin")).sendKeys("560023");
		driver.findElement(By.id("camob")).sendKeys("9876543123");
		
		//permanant address
		String permanant = wb.getSheet("sheet1").getRow(6).get.Cell(1).getStringCellValue();
		driver.findElement(By.id("padr")).sendKeys(permanant);
		driver.findElement(By.id("past")).sendKeys("karnataka");
		driver.findElement(By.id("papin")).sendKeys("413004");
		driver.findElement(By.id("pamob")).sendKeys("987654312");
		driver.findElement(By.id("rur")).click();
		driver.findElement(By.id("cat")).click();
		
		String nationality = wb.getSheet("sheet1").getRow(8).getCell(1).getStringCellValue();
		driver.findElement(By.id("natn")).sendKeys(nationality);
		
		String rollno = wb.getSheet("sheet1").getRow(9).getCell(1).toString();
		driver.findElement(By.id("oaroll")).sendKeys(rollno);
		
		String religion1 = wb.getSheet("sheet1").getRow(10).getCell(1).getStringCellValue();
		driver.findElement(By.id("relg")).sendKeys(religion1);
		
		String rank = wb.getSheet("sheet1").getRow(11).getCell(1).toString();
		driver.findElement(By.id("oarank")).sendKeys(rank);
		
		String branch = wb.getSheet("sheet1").getRow(12).getCell(1).getStringCellValue();
		driver.findElement(By.id("oabrn")).sendKeys(branch);
		
		String percent = wb.getSheet("sheet1").getRow(13).getCell(1).toString();		
		driver.findElement(By.id("pcm")).sendKeys(percent);
		
		String university = wb.getSheet("sheet1").getRow(14).getCell(1).getStringCellValue();
		driver.findElement(By.id("nob1")).sendKeys(university);
		
		String yrpass = wb.getSheet("sheet1").getRow(15).getCell(1).toString();
		driver.findElement(By.id("yop1")).sendKeys(yrpass);
		
		String totalmarks = wb.getSheet("sheet1").getRow(16).getCell(1).toString();
		driver.findElement(By.id("tm1")).sendKeys(totalmarks);
		
		String marksobt= wb.getSheet("sheet1").getRow(17).getCell(1).toString();
		driver.findElement(By.id("mo1")).sendKeys(marksobt);
		
		String division = wb.getSheet("sheet1").getRow(18).getCell(1).getStringCellValue();
		driver.findElement(By.id("divs1")).sendKeys(division);
		
		String percentage= wb.getSheet("sheet1").getRow(19).getCell(1).toString();
		driver.findElement(By.id("pom1")).sendKeys(percentage);
		
		String university1 = wb.getSheet("sheet1").getRow(20).getCell(1).getStringCellValue();
		driver.findElement(By.id("nob2")).sendKeys(university1);
		
		String yrpass1 = wb.getSheet("sheet1").getRow(21).getCell(1).toString();
		driver.findElement(By.id("yop2")).sendKeys(yrpass1);
		
		String totalmarks1 = wb.getSheet("sheet1").getRow(22).getCell(1).toString();
		driver.findElement(By.id("tm2")).sendKeys(totalmarks1);
		
		String marksobt1= wb.getSheet("sheet1").getRow(23).getCell(1).toString();
		driver.findElement(By.id("mo2")).sendKeys( marksobt1);
		
		String division1 = wb.getSheet("sheet1").getRow(24).getCell(1).getStringCellValue();
		driver.findElement(By.id("divs2")).sendKeys(division1);
		
		String percentage1= wb.getSheet("sheet1").getRow(25).getCell(1).toString();
		driver.findElement(By.id("pom2")).sendKeys(percentage1);*/
		
		
		driver.findElement(By.id("moi")).click();
		driver.findElement(By.id("pay")).click();
		driver.findElement(By.id("frmnext")).click();
		driver.findElement(By.id("fpic")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg");
		System.out.println(driver.findElement(By.id("fpic")).getText());
		 driver.findElement(By.id("ftndoc")).sendKeys("C:\\Users\\LENOVO\\Downloads\\Avinash N Resume.docx"); 
		/*driver.findElement(By.id("ftcdoc")).sendKeys("E:\\documents\\Data Driven testing 1.docx");
		driver.findElement(By.id("fdmdoc")).sendKeys("C:\\Users\\LENOVO\\Desktop\\Xpath Notes (1).docx");
		driver.findElement(By.id("fdcdoc")).sendKeys("C:\\Users\\LENOVO\\Desktop\\upload document.xlsx");
		
		driver.findElement(By.id("fide")).sendKeys("C:\\Users\\LENOVO\\Desktop\\requirements\\login.docx");
		driver.findElement(By.id("fsig")).sendKeys("C:\\Users\\LENOVO\\Desktop\\assignments on xpath\\olympic.PNG");
		
        driver.findElement(By.xpath("//input[@id='dec']")).click();*/
		
    

	}

}

