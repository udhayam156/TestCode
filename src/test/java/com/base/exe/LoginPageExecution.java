package com.base.exe;

import com.base.BaseClass;
import com.base.locators.LoginPageLocators;

public class LoginPageExecution extends LoginPageLocators   {
	
	public static void userName() {
		
		BaseClass.sendValue(LoginPageLocators.findElementbyname(username),BaseClass.excelread(0, 0));
	}
	
	public static void password() {
		
		BaseClass.sendValue(LoginPageLocators.findElementbyname(password), BaseClass.excelread(1, 0));
	}
	
	public static void click() {
		
		BaseClass.clickElement(LoginPageLocators.findElementbyname(loginButton));
	}
}
