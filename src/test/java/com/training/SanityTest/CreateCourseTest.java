package com.training.SanityTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.Utility.DriverNames;
import com.training.Utility.Driverfactory;
import com.training.pom.CreatecoursePOM;
import com.training.pom.LoginPOM;
import com.training.pom.PasswordResetPOM;

public class CreateCourseTest  {

	WebDriver driver;
	LoginPOM loginpom;
	String baseurl;
	Properties properties;
	CreatecoursePOM ccpom;
	PasswordResetPOM pasresetpom;
	@BeforeClass
	public void setUpBeforeclass() throws IOException
	{
		properties=new Properties();

		FileInputStream input=new FileInputStream("./projectresource/otherdoc.properties");
		properties.load(input);
		baseurl=properties.getProperty("baseURL");
		driver =Driverfactory.getDriver(DriverNames.chrome);
		driver.get(baseurl);
		loginpom = new LoginPOM(driver);
		ccpom=new CreatecoursePOM(driver);
		pasresetpom = new PasswordResetPOM(driver);
		
	}
	@Test()
	public void createcoursecodeTest() throws InterruptedException
	{
	/*	@Student login
		loginpom.sendUserName("abiramignan");	
		loginpom.password("abi@1234");
		loginpom.clickLogin();
		loginpom.SuccessfulLogin();*/
		
	//@ teacher login
		loginpom.sendUserName("dkabi123");	
		loginpom.password("abi@123");
		loginpom.clickLogin();
		ccpom.createcourselink();
		ccpom.cname("SeleniumSEP2New2021Aug");
		ccpom.advancesetting();
		ccpom.categoryclick();
		ccpom.selectvalue();
		ccpom.coursecodewant("SeleniumSEP2New2021Aug");
		ccpom.languagetabclick();
		ccpom.langselect();
		ccpom.coursetemp();
		ccpom.coursetempnameval("SeleniumSEP2New2021Aug");
		ccpom.clickaddcourse();
		ccpom.introductiondesc("Selenium version1");
		ccpom.coursedescription("Selenium courstitle","Selenium course description");
		ccpom.objectivedesc("SeleniumObjectTitle", "SeleniumObject description");
		ccpom.topicdesc("Seleniumtopictitle", "Seleniumtopicdesc");
		
		
		System.out.println(" Create course and Add Introduction and Course Description,OBjective ,Topic");
		
	}
}
