package com.training.SanityTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Utility.DriverNames;
import com.training.Utility.Driverfactory;
import com.training.pom.RegisterPOM;

public class RegisterTest {

	WebDriver driver;
	Properties properties;
	String baseurl;
	RegisterPOM regipom;
	
	@BeforeClass
	public void setUpBeforeclass() throws IOException
	{
		properties=new Properties();

		FileInputStream input=new FileInputStream("./projectresource/otherdoc.properties");
		properties.load(input);
	}
	@BeforeMethod
	public void setup()
	{
		driver=Driverfactory.getDriver(DriverNames.chrome);
		baseurl=properties.getProperty("baseURL");
		driver.get(baseurl);
		regipom=new RegisterPOM(driver);
		
	}
	
	@Test
	public void RegisterTest()
	{
		regipom.signup();
	//	regipom.registerAsstudent();
		regipom.registerAsTeacher();
		regipom.fname("Abi");
		regipom.lname("G2");
		regipom.email("dkabiarul@gmail.com");
		regipom.uname("dkabi123");
		regipom.pass1("abi@123");
		regipom.pass2("abi@123");
		regipom.language("English");
		regipom.languageclck();
		regipom.register();
		regipom.registersuccess();
		
		
	}
}

