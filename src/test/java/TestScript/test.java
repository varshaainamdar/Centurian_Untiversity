package TestScript;
import org.openqa.selenium.WebDriver;

import com.OnlineAdimissionSystem.comcat.pomrepositylib.ApplicationForm;
import com.onlineAdmissionSystem.comcast.genericutility.ExcelUtility;

public class test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		
		
		ExcelUtility excel = new ExcelUtility();
		
		//testdata
		String phone = excel.getExcelData("sheet1", 0, 1);	
		
		ApplicationForm applForm = new ApplicationForm(driver);
		applForm.getUphn1(phone);
		applForm.stdphone(phone);

	}

}
