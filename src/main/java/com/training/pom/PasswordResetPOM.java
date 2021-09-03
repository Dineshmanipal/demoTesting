package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordResetPOM {
WebDriver driver;
	public PasswordResetPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Edit profile")
	WebElement editprofile;
	
	
	@FindBy(name="password0")
	WebElement pass0;
	
	@FindBy(name="password1")
	WebElement pass1;
	
	@FindBy(name="password2")
	WebElement pass2;

	
	@FindBy(name="apply_change")
	WebElement saveset;
	
	@FindBy(xpath="//div[contains(text(),'Your new profile has been saved')]")
	WebElement profilesave;
	public void editfprofile()
	{
		this.editprofile.click();
	}
	
	public void pass0(String pass0)
	{
		this.pass0.sendKeys(pass0);
		
	}
	public void pass1(String pass1)
	{
		this.pass1.sendKeys(pass1);
		
	}
	public void pass2(String pass2)
	{
		this.pass2.sendKeys(pass2);
		
	}
	
	public void save()
	{
		this.saveset.click();
	}
	
	public String profilesaved()
	{
		String expectedText =this.profilesave.getText();
		System.out.println(expectedText);
		return expectedText;
	}
}
