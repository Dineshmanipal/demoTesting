package com.training.SanityTest;

import org.testng.Assert;
import org.testng.annotations.Test;



public class PasswordResetTest extends LoginTest {
	
	@Test()
	public void passwordReset()
	{		
		pasresetpom.editfprofile();
		pasresetpom.pass0("abi@1234");
		pasresetpom.pass1("manipal@134");
		pasresetpom.pass2("manipal@134");
		pasresetpom.save();
		String expectedText=pasresetpom.profilesaved();
		
		String actualText="Your new profile has been saved";
		Assert.assertEquals(expectedText, actualText);
		System.out.println("Successfully save");
	}
	
	
	
}
