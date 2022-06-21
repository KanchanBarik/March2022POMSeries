package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.Constant;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginPageTitleTest(){
	String actTitle=loginpage.getLoginPageTitle();
	System.out.println("Actual Title::"+actTitle);
	Assert.assertEquals(actTitle, Constant.LOGIN_PAGE_TITLE);
	}
	
	@Test
	public void loginPageURLTest(){
		String actURL=loginpage.getLoginPageURL();
		Assert.assertTrue(actURL.contains(Constant.LOGIN_PAGE_URL));
	}
	public void doLoginTest(){
		//loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		
	}

}
