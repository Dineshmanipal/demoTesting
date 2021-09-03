package com.training.SanityTest;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.Utility.DriverNames;
import com.training.Utility.Driverfactory;
import com.training.pom.CreatecoursePOM;
import com.training.pom.LoginPOM;
import com.training.pom.PasswordResetPOM;

public class LoginTest {

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
	
	@AfterClass
	public void teardown()
	{
		//driver.close();
	}

	@Test()
	public void loginTest()
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
	//	loginpom.SuccessfulLogin();
		/*	pasresetpom.editfprofile();
		pasresetpom.pass0("manipal@123");
		pasresetpom.pass1("manipal@1234");
		pasresetpom.pass2("manipal@1234");
		pasresetpom.save(); */
		//ccpom.courselink();
	/*	ccpom.createcourselink();
		ccpom.cname("Selenium");
		ccpom.advancesetting();
		
		ccpom.categoryclick();
		ccpom.selectvalue(); */
		
	}
}
