package TestScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OnlineAdimissionSystem.comcat.pomrepositylib.ApplicationForm;
import com.OnlineAdimissionSystem.comcat.pomrepositylib.SubmitDocumentPage;
import com.OnlineAdimissionSystem.comcat.pomrepositylib.VerifyUploadDocumentPage;
import com.onlineAdmissionSystem.comcast.genericutility.BaseClass;

@Listeners(com.onlineAdmissionSystem.comcast.genericutility.LisImpClass.class)
public class VerifyOnlineAdmissionSystem extends BaseClass {
	@Test(retryAnalyzer = com.onlineAdmissionSystem.comcast.genericutility.ReTryImpclass.class)
	public void verifyapplicationForm() throws Throwable {
		// read the data
		// WebDriverWait wait=new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.urlContains("admsnform.php"));
		ApplicationForm app = new ApplicationForm(driver);
      Assert.fail();
		String phone = elib.getExcelData("sheet1", 0, 1);
		app.stdphone(phone);

		String Mob = elib.getExcelData("sheet1", 0, 2);
		app.stdphone2(Mob);

		// fathername
		String fname = elib.getExcelData("sheet1", 1, 1);
		app.fathername(fname);

		// fatheroccupation
		String occup = elib.getExcelData("sheet1", 2, 1);
		app.foccupation(occup);

		// fathermobileno
		String Mob1 = elib.getExcelData("sheet1", 2, 3);
		app.fathermob(Mob1);

		// mothername
		String mname = elib.getExcelData("sheet1", 3, 1);
		app.mothername(mname);

		// motheroccupation
		String occup1 = elib.getExcelData("sheet1", 4, 1);
		app.moccupation(occup1);

		// mothermobileno
		String Mob2 = elib.getExcelData("sheet1", 4, 3);
		app.mothermobileno(Mob2);

		// parenticome
		String income = elib.getExcelData("sheet1", 5, 1);
		app.parentincome(income);

		// gender
		app.gender();

		// corresponding address
		String corres = elib.getExcelData("sheet1", 6, 1);
		app.correadd(corres);

		String corres1 = elib.getExcelData("sheet1", 6, 2);
		app.correadd1(corres1);

		String corres2 = elib.getExcelData("sheet1", 6, 3);
		app.correadd2(corres2);

		String corres3 = elib.getExcelData("sheet1", 6, 4);
		app.correadd3(corres3);

		String permanant = elib.getExcelData("sheet1", 6, 1);
		app.permantadd(permanant);

		String permanant1 = elib.getExcelData("sheet1", 7, 2);
		app.permantadd1(permanant1);

		String permanant2 = elib.getExcelData("sheet1", 7, 3);
		app.permantadd2(permanant2);

		String permanant3 = elib.getExcelData("sheet1", 7, 4);
		app.permantadd3(permanant3);

		String nationality = elib.getExcelData("sheet1", 8, 1);
		app.nationality1(nationality);

		String rollno = elib.getExcelData("sheet1", 9, 1);
		app.rollno(rollno);

		String religion = elib.getExcelData("sheet1", 10, 1);
		app.religion1(religion);

		String rank = elib.getExcelData("sheet1", 11, 1);
		app.rank(rank);

		String branch = elib.getExcelData("sheet1", 12, 1);
		app.branch(branch);

		String percent = elib.getExcelData("sheet1", 13, 1);
		app.percentage(percent);

		String universityname = elib.getExcelData("sheet1", 14, 1);
		app.universityname(universityname);

		String yrpass = elib.getExcelData("sheet1", 15, 1);
		app.yearofpassing(yrpass);

		String totalmarks = elib.getExcelData("sheet1", 16, 1);
		app.totalmarks1(totalmarks);

		String marksobt = elib.getExcelData("sheet1", 17, 1);
		app.markobtain(marksobt);

		String division = elib.getExcelData("sheet1", 18, 1);
		app.division1(division);

		String percent1 = elib.getExcelData("sheet1", 19, 1);
		app.percent1(percent1);

		String university1 = elib.getExcelData("sheet1", 20, 1);

		app.universityname1(university1);

		String yrpass1 = elib.getExcelData("sheet1", 21, 1);
		app.yearpass1(yrpass1);

		String totalmarks2 = elib.getExcelData("sheet1", 22, 1);
		app.totalmarks2(totalmarks2);

		String marksobt1 = elib.getExcelData("sheet1", 23, 1);
		app.marksobtained1(marksobt1);
		;

		String division1 = elib.getExcelData("sheet1", 24, 1);
		app.division2(division1);

		String percentage3 = elib.getExcelData("sheet1", 25, 1);
		app.percentt(percentage3);

		app.medium();
		app.payself();

		app.nextpage();
	
		
		// upload the documents
		
		
		VerifyUploadDocumentPage verify = new VerifyUploadDocumentPage(driver);

		String passportimage = elib.getExcelData("sheet2", 0, 1);
		verify.passport(passportimage);

		String marksheet = elib.getExcelData("sheet2", 1, 1);
		verify.tenthmarksheet(marksheet);

		String marksheet1 = elib.getExcelData("sheet2", 2, 1);
		verify.twelethmarksheet(marksheet1);

		String id = elib.getExcelData("sheet2", 3, 1);
		verify.idproofdocument(id);

		String sign = elib.getExcelData("sheet2", 3, 1);
		verify.signproofdocument(sign);

		SubmitDocumentPage sub = new SubmitDocumentPage(driver);
		sub.submitbutton();
		String url=driver.getCurrentUrl();
		String expresult= "admsnreport.php";
    SoftAssert soft = new SoftAssert();
    soft.assertTrue(url.contains(expresult));
    System.out.println("VerifyOnlineAdmissionSystem is pass");
   soft.assertAll();
    
    
	}
}
