package com.BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.TestUtilClass;

public class TestBaseClass {
 public static	WebDriver driver;
 public static Properties prop;
 
 
 
 public TestBaseClass() throws IOException {
	 prop=new Properties();
	 FileInputStream fis=new FileInputStream("D:/SeleniumWeakendBatch/NaveenProject/src/main/java/com/config/config.properties");
	 prop.load(fis);
 }

 public  void initialization() { 
	String browserName = prop.getProperty("Browser"); 
	if(browserName.equalsIgnoreCase("Chrome")) { 
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	//else if(browserName.equals("FF")){
	//	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	//	driver=new FireFoxDriver();
	//}else if(browserName.equals("IE")) {
	//	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	//	driver=new ChromeDriver();
	//}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtilClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtilClass.IMPLICITE_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("URL"));
 }
}
