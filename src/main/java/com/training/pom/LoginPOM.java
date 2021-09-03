package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

	WebDriver driver;
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	WebElement Loginbtn;
	
	@FindBy(xpath="//div[@class='normal-message']")
	WebElement welcomemsg;
	
	public void sendUserName(String userName)
	{
		//this.UserName.clear();
		this.UserName.sendKeys(userName);
	}
	
	public void password(String password)
	{
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		this.Loginbtn.click();
	}
	
	public void SuccessfulLogin()
	{
		String welcome=this.welcomemsg.getText();
		System.out.println(welcome);
		
	}
	
	
	
}
