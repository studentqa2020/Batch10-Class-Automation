package com.testexecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.java.BaseLogin;

public class SmokeTestWithTEstNG {
static WebDriver driver;


@BeforeTest
public static  void getDriverSetup() throws Throwable{
	
	 driver = BaseLogin.getDriverManager();
	
	
}
@Test
public static void getTest() throws Throwable{
	driver=	BaseLogin.getLogin(driver);
	
	
}
@AfterTest
public static void getClose() throws Throwable {
	Thread.sleep(3000);
	driver.quit();	
}

}
