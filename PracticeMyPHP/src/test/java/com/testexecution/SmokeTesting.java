package com.testexecution;

import org.openqa.selenium.WebDriver;

import com.generic.java.BaseLogin;

public class SmokeTesting {

public static void main(String[] args ) throws Throwable {
	
WebDriver driver;

 driver = BaseLogin.getDriverManager();
driver=	BaseLogin.getLogin(driver);

Thread.sleep(3000);
driver.quit();
	
}	
}
