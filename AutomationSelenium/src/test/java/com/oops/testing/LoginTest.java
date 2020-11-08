package com.oops.testing;

import org.openqa.selenium.WebDriver;

import com.generic.code.AutomationLogin;

public class LoginTest {

	static WebDriver driver;// Global>>instance

	public static void main(String[] args) throws Throwable {
		driver = AutomationLogin.getlogin();
		Thread.sleep(10000);//milsec =10x1000
		driver.quit();
		//ctrl+Lt click = inside the class or method
	}
}
