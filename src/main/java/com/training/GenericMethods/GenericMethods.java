package com.training.GenericMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {

	WebDriver driver;

	public WebElement getElement(String locator,String type)
	{
		WebElement element ;	
		if(type.equals("id"))
		{
			element =driver.findElement(By.id(locator));
		}else if(type.equals("name"))
		{
			element=driver.findElement(By.name(locator));
		}else if(type.equals("xpath"))
		{
			element=driver.findElement(By.xpath(locator));
		}else if (type.equals("linkText"))
		{
			element=driver.findElement(By.xpath(locator));
		}
		
		return null;
	}


}

