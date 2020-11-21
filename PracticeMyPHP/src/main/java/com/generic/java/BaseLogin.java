package com.generic.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.page.object.model.MasterPageFactoryLoginPage;
import com.unit.BaseConfig;
import com.unit.Highlighter;
import com.unit.SeleniumWait;

public class BaseLogin {

public static WebDriver getDriverManager() throws Throwable {
System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
WebDriver driver =new FirefoxDriver();	
driver.manage().window().maximize();	
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
driver.get(BaseConfig.getConfigValue("Url"));
return driver;
}

public static WebDriver getLogin(WebDriver driver) throws Throwable{

MasterPageFactoryLoginPage pf = new MasterPageFactoryLoginPage( driver);

Highlighter.getcolor(driver, pf.getMyaccount());
SeleniumWait.getExplicitWait(driver, pf.getMyaccount());
pf.getMyaccount().click();

Highlighter.getcolor(driver, pf.getLogin());
SeleniumWait.getExplicitWait(driver, pf.getLogin());
pf.getLogin().click();

Highlighter.getcolor(driver, pf.getEmail());
pf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));

Highlighter.getcolor(driver, pf.getPass());
pf.getPass().sendKeys(BaseConfig.getConfigValue("Pass"));

Highlighter.getcolor(driver, pf.getFinallogin());
SeleniumWait.getExplicitWait(driver, pf.getFinallogin());
pf.getFinallogin().click();


return driver;
}
	
	
}
