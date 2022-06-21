package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.utils.ElementUtil;

public class BaseTest {
	
	public WebDriver driver;
	public DriverFactory df;
	public LoginPage loginpage;
	public Properties prop;
	public ElementUtil eleUtil;
	
	@BeforeTest
	public void setUp(){
		df= new DriverFactory();
		prop=df.init_prop();
		driver=df.init_browser(prop);
		loginpage=new LoginPage(driver);
		eleUtil=new ElementUtil();
	}
	
	@AfterTest
	public void tearDown(){
		//driver.close();
		
	}
	

}
