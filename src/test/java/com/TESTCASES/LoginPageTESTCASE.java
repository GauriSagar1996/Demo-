package com.TESTCASES;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseTest.TestBaseClass;
import com.POMPAGES.HomePage;
import com.POMPAGES.LoginPage;

public class LoginPageTESTCASE extends TestBaseClass{
	LoginPage page;
	HomePage homepage;

	public LoginPageTESTCASE() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void beforeSetUP() throws Exception {
		initialization();
	    page=new LoginPage();
	}
	
//	@Test(priority = 1)
//	public void validateLoginPageTitle() {
//		String title = page.validateLoginPageTitle();
//		Assert.assertEquals(title, "actiTIME -  Login","LoginPageTitle is not Matched");
//	}
//	
	@Test(priority = 1)
	public void actitimeLogoValidateTest() {
		boolean flag = page.validateActitimeLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void loginTest() throws Exception {
		try {
			homepage=page.loginToActitime(prop.getProperty("UserName"), prop.getProperty("Password"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@AfterMethod
	public void endSetUp() {
		//driver.close();
	}
}
