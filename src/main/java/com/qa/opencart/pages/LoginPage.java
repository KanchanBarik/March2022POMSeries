package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.Constant;
import com.qa.opencart.utils.ElementUtil;

public class LoginPage {
	public WebDriver driver;
	private ElementUtil eleUtil;
	
	private By emailId= By.id("input-email");
	private By pwd= By.id("input-password");
	private By logBtn= By.xpath("//input[@value='Login']");
	private By forfgotPwdLink=By.linkText("Forgotten Password");
	private By registerLink=By.linkText("Register");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	public String getLoginPageTitle(){
		return eleUtil.waitForTitleIs(Constant.LOGIN_PAGE_TITLE, Constant.LOGIN_PAGE_TIMEOUT);
	}
	
	public String getLoginPageURL(){
		return driver.getCurrentUrl();
	}
	
	public void doLogin(String username,String password){
		driver.findElement(emailId).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(logBtn).click();
	}

	public boolean forgotLinkIsDisplayed(){
		return driver.findElement(forfgotPwdLink).isDisplayed();
	}
	}