package com.POMPAGES;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.TestBaseClass;

public class HomePage extends TestBaseClass{
//Declaration
	@FindBy (xpath="//div[@id='container_tasks']")
	WebElement task;
	
	
	
//Initialization
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public String verifyHomePageTitle() {
		String title=driver.getTitle();
		return title;
		
	}
	public void clickOnTask() {
		task.click();
	String title = driver.getTitle();
	System.out.println(title);
	}
	
}

