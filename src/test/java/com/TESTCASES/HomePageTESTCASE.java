package com.TESTCASES;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseTest.TestBaseClass;
import com.POMPAGES.HomePage;
import com.POMPAGES.LoginPage;

public class HomePageTESTCASE extends TestBaseClass{

	LoginPage page;
	HomePage homepage;

	public HomePageTESTCASE() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void beforeSetUP() throws Exception {
		initialization();
	    page=new LoginPage();
	   homepage= page.loginToActitime(prop.getProperty("UserName"), prop.getProperty("Password"));
	   
	}
	
//	@Test
//	public void validateHomePageTitle() {
//	   String HomepageTitle=homepage.verifyHomePageTitle();
//	   Assert.assertEquals(HomepageTitle, "actiTIME -  Enter Time-Track","Home page title is not matched");
//	}

	@Test
	public void taskLink() {
	   homepage.clickOnTask();
	}
	
	@AfterMethod
	public void endSetUp() {
		//driver.close();
	}
}
