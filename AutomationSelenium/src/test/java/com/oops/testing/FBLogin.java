package com.oops.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;
import com.xpath.pagefactory.MasterPageFactory;

public class FBLogin {
	
	public static void main(String[] args) throws Throwable {
	
     System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");      
     WebDriver driver = new ChromeDriver();//up casting
     
     driver.get("http://automationpractice.com/index.php");// mostly 
     driver.manage().window().maximize();
     
     MasterPageFactory obj = new MasterPageFactory(driver);   
     Highlighter.getcolor(driver, obj.getSignBtn());
     obj.getSignBtn().click();
    
     Highlighter.getcolor(driver, obj.getEmail());
     obj.getEmail().sendKeys("sarowerny@gmail.com");
     
     Highlighter.getcolor(driver, obj.getPassword());
     obj.getPassword().sendKeys("student");
     obj.getFinalSignin().click();
	}

}
