package com.POMPAGES;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.TestBaseClass;

public class LoginPage extends TestBaseClass {
	


	//Declaration
	@FindBy(xpath = "//div[@class='atLogoImg']")
	WebElement ActitimeLogo;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement UserNameTextFeild;
	
	@FindBy(xpath="//input[@name='pwd']")
	WebElement PasswordtextFeil;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	WebElement KeepMeLoginCheckbox;
	
	@FindBy (xpath ="//a[@id='loginButton']")
	WebElement LoginButton;
	
	
	

//Initialization
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
//Utilization
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateActitimeLogo() {
		return ActitimeLogo.isDisplayed();
	}
	public HomePage loginToActitime(String un,String pwd) throws IOException  {
		UserNameTextFeild.sendKeys(un);
		PasswordtextFeil.sendKeys(pwd);
		//KeepMeLoginCheckbox.click();
		LoginButton.click();
		return new HomePage();
		
	}
	
}
