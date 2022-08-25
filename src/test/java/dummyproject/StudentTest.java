package dummyproject;

import org.testng.annotations.Test;

public class StudentTest {
	@Test(groups={"smokeTest"})
	public void createStudentdetailsTest() {
		System.out.println("create student details");
	}
	
	@Test(groups= {"regressionTest"})
	public void modifyStudentsdetailsTest() {
		System.out.println("execution modify studentdetails details");
	}
	
	@Test(groups={"smokeTest"})
	public void deleteStudentdetailsTest()
	{
		System.out.println("execute student detsils test");
	}
	
}
