package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {

	
	WebDriver driver;
	public RegisterPOM(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	WebElement signup;
	
	@FindBy(xpath="//input[@value='5']")
	WebElement registerasstudent;
	
	@FindBy(xpath="//input[@value='1']")
	WebElement registerasTeacher;
	
	@FindBy(id="registration_firstname")
	WebElement fname;
	
	@FindBy(id="registration_lastname")
	WebElement lname;
	
	@FindBy(id="registration_email")
	WebElement email;
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="pass1")
	WebElement pass1;
	
	@FindBy(name="pass2")
	WebElement pass2;
	
	@FindBy(xpath="//button[@title='English']")
	WebElement lang;
	
	@FindBy(id="registration_submit")
	WebElement register;
	
	@FindBy(xpath="//section[@id='cm-content']")
	WebElement registersuccess;
	
	public void signup()
	{
		this.signup.click();
	}
	public void registerAsstudent()
	{
		this.registerasstudent.click();
	}public void registerAsTeacher()
	{
		this.registerasTeacher.click();
	}
	
	public void fname(String fname)
	{
		this.fname.sendKeys(fname);
	}
	public void lname(String lname)
	{
		this.lname.sendKeys(lname);
	}
	
	public void email(String email)
	{
		this.email.sendKeys(email);
	}
	
	public void uname(String uname)
	{
		this.uname.sendKeys(uname);
	}
	

	public void pass1(String pass1)
	{
		this.pass1.sendKeys(pass1);
	}
	public void pass2(String pass2)
	{
		this.pass2.sendKeys(pass2);
	}
	
	public void language(String lang)
	{
		this.lang.sendKeys(lang);
	}
	public void languageclck()
	{
		this.lang.click();
	}
	
	public void register()
	{
		this.register.click();
	}
	
	public void registersuccess() {
		String reg=this.registersuccess.getText();
		System.out.println(reg);
	}
	
}


