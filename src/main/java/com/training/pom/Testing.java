package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://elearning.upskills.in/");
		driver.findElement(By.id("login")).sendKeys("dkabi123");
		driver.findElement(By.id("password")).sendKeys("abi@123");
		driver.findElement(By.id("form-login_submitAuth")).click();
		/*driver.findElement(By.xpath("//a[contains(text(),'Create a course')]")).click();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Seleniumver");
		driver.findElement(By.id("advanced_params")).click();
		WebElement sel=driver.findElement(By.xpath("//select[@id='add_course_category_code']//parent::div"));
		sel.click();
		driver.findElement(By.xpath("//span[text()='Language skills (LANG)']")).click(); */

		driver.findElement(By.xpath("//a[contains(text(),'Selenium')]")).click();
		driver.findElement(By.xpath("//div[@class='help-course']//a[@title='Add an introduction text']")).click();
		Thread.sleep(10000);
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Welcome to Selenoiim");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("introduction_text_intro_cmdUpdate")).click();
		
		driver.findElement(By.xpath("//img[@title='Course description']")).click();
		driver.findElement(By.xpath("//img[@title='Description']")).click();
		driver.findElement(By.id("course_description_title")).sendKeys("Selenium for beginnere");
		WebElement courseframe=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(courseframe);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Selenium for beginere");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='course_description_submit']")).click();

		driver.findElement(By.xpath("//img[@title='Objectives']")).click();
		driver.findElement(By.id("course_description_title")).sendKeys("SeleniumOBjective");
		WebElement iframeobjective=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(iframeobjective);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Selenium Objective");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='course_description_submit']")).click();


		driver.findElement(By.xpath("//img[@title='Topics']")).click();
		driver.findElement(By.id("course_description_title")).sendKeys("Selenium Topics");
		WebElement iframetopic=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(iframetopic);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Selenium topic");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='course_description_submit']")).click();
	}

}
