package com.OnlineAdimissionSystem.comcat.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationForm {
	WebDriver driver;
	public ApplicationForm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//student phone no
	@FindBy(name="uphn1")
	private WebElement uphn1;

	@FindBy(id="uphn2")
  private WebElement uphn2;
	
	//fathername
	@FindBy(id="ufname")
private WebElement ufname;
	
	//occupation
	@FindBy(id="ufocc")
private	WebElement ufocc;
	
	//father's mobile no
	@FindBy(id="ufphn")
private	WebElement ufphn;
	
	//mothername
	@FindBy(id="umname")
private	WebElement umname;
	
	//mother's occupation
	@FindBy(id="umocc")
private	WebElement umocc;
	
	//mother's mobileno 
	@FindBy(id="umphn")
private	WebElement umphn;
	
	//parentincome
	@FindBy(id="inc")
private	WebElement inc;
	
	@FindBy(id="gen")
private	WebElement gen;
	
	//correspond address
	@FindBy(id="cadr")
private WebElement cadr;
	
	@FindBy(id="cast")
private	WebElement cast;
	
	@FindBy(id="capin")
private	WebElement capin;
	
	@FindBy(id="camob")
private	WebElement camob;
	
	//permant address
	@FindBy(id="padr")
private	WebElement padr;
	
	@FindBy(id="past")
private	WebElement past;
	
	@FindBy(id="papin")	
private	WebElement papin;
	
	@FindBy(id="pamob")
private	WebElement pamob;
	
	
	//nationaluty
	@FindBy(id="natn")
   private WebElement natn;
	
	//rollno
	@FindBy(id="oaroll")
	private WebElement oaroll;
	
	//rank
	@FindBy(id="oarank")
private	WebElement oarank;
	
	//religion
	@FindBy(id="relg")
	private WebElement relg;
	
	//branch
	@FindBy(id="oabrn")
private	WebElement oabrn;
	
	//percent
	@FindBy(id="pcm")
private	WebElement pcm;
	
	//university
	@FindBy(id="nob1")
private	WebElement nob1;
	
	//yrpass
	@FindBy(id="yop1")
	private WebElement yop1;
	
	//totalmarks
	@FindBy(id="tm1")
private	WebElement tm1;
	
	//marksobt
	@FindBy(id="mo1")
private	WebElement mo1;
	
	//division
	@FindBy(id="divs1")
	private WebElement divs1;
	
	//percentage
	@FindBy(id="pom1")
private	WebElement pom1;
	
	//university1
	@FindBy(id="nob2")
private	WebElement nob2;
		
	//yearpass1
	@FindBy(id="yop2")
private	WebElement yop2;
	
	//totalmarks2
	@FindBy(id="tm2")
private	WebElement tm2;
	
	//marks2
	@FindBy(id="mo2")
private	WebElement mo2;
	
	//division2
	@FindBy(id="divs2")
private	WebElement divs2;
	
	//ercentage
	@FindBy(id="pom2")
private	WebElement pom2;
	
	@FindBy(id="moi")
private	WebElement moi;
	
	
	@FindBy(id="pay")
	private WebElement pay;
	
	@FindBy(id="frmnext")
	WebElement frmnext;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUphn1(String userPhn) {
		return uphn1;
	}

	public WebElement getUphn2() {
		return uphn2;
	}

	public WebElement getUfname() {
		return ufname;
	}

	public WebElement getUfocc() {
		return ufocc;
	}

	public WebElement getUfphn() {
		return ufphn;
	}

	public WebElement getUmname() {
		return umname;
	}

	public WebElement getUmocc() {
		return umocc;
	}

	public WebElement getUmphn() {
		return umphn;
	}

	public WebElement getInc() {
		return inc;
	}

	public WebElement getGen() {
		return gen;
	}

	public WebElement getCadr() {
		return cadr;
	}

	public WebElement getCast() {
		return cast;
	}

	public WebElement getCapin() {
		return capin;
	}

	public WebElement getCamob() {
		return camob;
	}

	public WebElement getPadr() {
		return padr;
	}

	public WebElement getPast() {
		return past;
	}

	public WebElement getPapin() {
		return papin;
	}

	public WebElement getPamob() {
		return pamob;
	}

	public WebElement getNatn() {
		return natn;
	}

	public WebElement getOaroll() {
		return oaroll;
	}

	public WebElement getOarank() {
		return oarank;
	}

	public WebElement getOabrn() {
		return oabrn;
	}

	public WebElement getPcm() {
		return pcm;
	}

	public WebElement getNob1() {
		return nob1;
	}

	public WebElement getYop1() {
		return yop1;
	}

	public WebElement getTm1() {
		return tm1;
	}

	public WebElement getMo1() {
		return mo1;
	}

	public WebElement getDivs1() {
		return divs1;
	}

	public WebElement getPom1() {
		return pom1;
	}

	public WebElement getNob2() {
		return nob2;
	}

	public WebElement getYop2() {
		return yop2;
	}

	public WebElement getTm2() {
		return tm2;
	}

	public WebElement getMo2() {
		return mo2;
	}

	public WebElement getDivs2() {
		return divs2;
	}

	public WebElement getPom2() {
		return pom2;
	}

	public WebElement getMoi() {
		return moi;
	}

	public WebElement getPay() {
		return pay;
	}

	public WebElement getFrmnext() {
		return frmnext;
	}

	
	
	//business lib
		public void stdphone(String phone)
		{
			uphn1.sendKeys(phone);
		}
		

		public void stdphone2(String Mob)
		{
			uphn2.sendKeys(Mob);
		}
	
	public void fathername(String fname)
	{
		ufname.sendKeys(fname);
	}
	
	public void foccupation(String occup)
	{
		ufocc.sendKeys(occup);
	}
  
	 public void fathermob(String Mob1 )
	 {
		 ufphn.sendKeys(Mob1);
	 }
	 
	 public void mothername(String  mname)
	 {
		 umname.sendKeys(mname);
	 }
	 public void moccupation(String occup1 )
	 {
		 umocc.sendKeys(occup1);
	 }
	 public void mothermobileno(String Mob2 )
	 {
	 umphn.sendKeys(Mob2);
}
	 public void parentincome(String income)
	 {
		 inc.sendKeys(income);
	 }
	 public void gender()
	 {
		 gen.click(); 
	
		
	}
	 public void correadd(String corres)
	 {
		 cadr.sendKeys(corres);
	 }
	 public void correadd1(String corres1)
	 {
		 cast.sendKeys(corres1);
	 }
	 public void correadd2(String corres2)
	 {
		 capin.sendKeys(corres2);
	 }
	 public void correadd3(String corres3)
	 {
		 camob.sendKeys(corres3);
	 }
	 
	 public void permantadd(String permanant)
	 {
		 padr.sendKeys(permanant);
	 }
	 public void permantadd1(String permanant1)
	 {
		 past.sendKeys(permanant1);
	 }
	 public void permantadd2(String permanant2 )
	 {
		 papin.sendKeys(permanant2);
	 }
	 public void permantadd3(String permanant3)
	 {
		 pamob.sendKeys(permanant3);
	 }
	 public void nationality1(String nationality)
	 {
		 natn.sendKeys(nationality);
	 }
	 public void rollno(String rollno)
	 {
	 oaroll.sendKeys(rollno);
	 }
	 public void rank(String rank)
	 {
	 oarank.sendKeys(rank);
	 
}
	 public void religion1(String religion)
	 {
		 relg.sendKeys(religion);
	 }

	public void religion(String religion) {

		
	}
	public void branch(String branch)
	{
	oabrn.sendKeys(branch);
}
	public void percentage(String percent)
	{
		pcm.sendKeys(percent);
	}
	public void universityname(String university )
	{
		nob1.sendKeys(university);
	}
	public void yearofpassing(String yrpass)
	{
		yop1.sendKeys(yrpass);
		
	}
	public void totalmarks1(String totalmarks)
	{
		tm1.sendKeys(totalmarks);
	}
	public void markobtain(String marksobt)
	{
		mo1.sendKeys(marksobt);

		}
	public void division1(String division)
	{
		divs1.sendKeys(division);
	}
	
	public void percent1(String percent1)
	{
		pom1.sendKeys(percent1);
	}
	public void universityname1(String  university1)
	{
		nob2.sendKeys(university1);
	}
	public void yearpass1(String yrpass1)
	{
		yop2.sendKeys(yrpass1);
	}
	public void totalmarks2(String  totalmarks2)
	{
		tm2.sendKeys(totalmarks2);
	}
	public void marksobtained1(String marksobt1)
	{
		mo2.sendKeys(marksobt1);
	}
	public void division2(String division2)
	{
		divs2.sendKeys(division2);
	}
	public void percentt(String percentage3)
	{
		pom2.sendKeys(percentage3);
	}
	
	public void medium( )
	{
		moi.click();
	}
	
	public void payself()
	{
		pay.click();
	}
	public void nextpage()
	{
		frmnext.click();
	}
		
	}

