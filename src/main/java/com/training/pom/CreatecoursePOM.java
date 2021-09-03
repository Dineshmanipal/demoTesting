package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatecoursePOM {

	WebDriver driver;

	public CreatecoursePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText="Create a course")
	WebElement createcoursel;

	@FindBy(xpath="//input[@name='title']")
	WebElement cname;

	@FindBy(id="advanced_params")
	WebElement advanceset;




	@FindBy(xpath="//select[@id='add_course_category_code']//parent::div")
	WebElement sel;

	@FindBy(xpath="//span[text()='Language skills (LANG)']")
	WebElement selvalue;

	@FindBy(xpath="//input[@id='add_course_wanted_code']")
	WebElement coursecode;

	@FindBy(xpath="//select[@id='add_course_course_language']//parent::div")
	WebElement langsel;

	@FindBy(xpath="//span[text()='English']")
	WebElement sellangvalue;

	@FindBy(xpath="//span[@role='combobox']")
	WebElement coursetempl;

	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement coursetempname;

	@FindBy(xpath="//button[@id='add_course_submit']")
	WebElement clickaddcourse;

	@FindBy(xpath="//div[@class='help-course']//a[@title='Add an introduction text']")
	WebElement introicon;

	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement introframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	WebElement textintroframe;
	
	@FindBy(xpath="//button[@id='introduction_text_intro_cmdUpdate']")
	WebElement introsave;
	
	@FindBy(xpath="//img[@title='Course description']")
	WebElement cdescription;
	@FindBy(xpath="//img[@title='Description']")
	WebElement cdesc;
	
	@FindBy(xpath="//input[@id='course_description_title']")
	WebElement ctitle;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement cdescframe;
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	WebElement textcourseframe;
	
	@FindBy(xpath="//button[@id='course_description_submit']")
	WebElement coursesave;
	
	
	@FindBy(xpath="//img[@title='Objectives']")
	WebElement objecticon;
	
	@FindBy(xpath="//input[@id='course_description_title']")
	WebElement objtitle;
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement objframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	WebElement textobj;
	@FindBy(xpath="//button[@id='course_description_submit']")
	WebElement objsave;
	
	
	
	@FindBy(xpath="//img[@title='Topics']")
	WebElement topicicon;
	
	@FindBy(xpath="//input[@id='course_description_title']")
	WebElement topictitle;
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement topicframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	WebElement topictext;
	
	@FindBy(xpath="//button[@id='course_description_submit']")
	WebElement topicsave;
	
	public void topicdesc(String topictitle,String topicdesc)
	{
		this.topicicon.click();
		this.topictitle.sendKeys(topictitle);
		driver.switchTo().frame(topicframe);
		this.topictext.sendKeys(topicdesc);
		driver.switchTo().defaultContent();
		this.topicsave.click();
		
		
	}
	
	public void objectivedesc(String objecttitle,String objectdesc)
	{
		this.objecticon.click();
		this.objtitle.sendKeys(objecttitle);
		driver.switchTo().frame(objframe);
		this.textobj.sendKeys(objectdesc);
		driver.switchTo().defaultContent();
		this.objsave.click();
		
		
	}
	
	public void coursedescription(String coursetitle,String coursedesc)
	{
		this.cdescription.click();
		this.cdesc.click();
		this.ctitle.sendKeys(coursetitle);
		driver.switchTo().frame(cdescframe);
		this.textcourseframe.sendKeys(coursedesc);
		driver.switchTo().defaultContent();
		this.coursesave.click();
	}
	
	
	public void introductiondesc(String introdesc) throws InterruptedException
	{this.introicon.click();
	Thread.sleep(10000);
      driver.switchTo().frame(introframe);
      this.textintroframe.sendKeys(introdesc);
      driver.switchTo().defaultContent();
      this.introsave.click();
	}


	
	public void clickaddcourse()
	{
		this.clickaddcourse.click();
	}

	public void coursetempnameval(String tempname)
	{
		this.coursetempname.sendKeys(tempname);
	}
	public void coursetemp()
	{
		this.coursetempl.click();

	}

	public void langselect()
	{
		this.sellangvalue.click();
	}

	public void languagetabclick()
	{
		this.langsel.click();
	}

	public void coursecodewant(String ccode)
	{
		this.coursecode.sendKeys(ccode);
	}


	public void categoryclick() {
		this.sel.click();
	}
	public void selectvalue() {
		this.selvalue.click();
	}

	public void advancesetting()
	{
		this.advanceset.click();
	}



	public void cname(String coname)
	{
		this.cname.sendKeys(coname);
	}

	public void createcourselink()
	{
		this.createcoursel.click();
	}




}
