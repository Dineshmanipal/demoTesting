package com.training.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {

	public static WebDriver driver;
	
	public static WebDriver getDriver(String drivername)
	{
		if(drivername.equals(DriverNames.chrome)){
				WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		}
		
		
		else if(drivername.equals(DriverNames.firefox))
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window();
		return driver;
		
	}
}
