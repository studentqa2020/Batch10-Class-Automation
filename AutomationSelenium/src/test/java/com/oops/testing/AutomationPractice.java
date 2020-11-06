package com.oops.testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.config.BaseConfig;
import com.page.factory.LoginPage;
import com.util.XXX;
import com.util.WaitHandler;

public class AutomationPractice {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximum or full size
		driver.get(BaseConfig.getconfig("URL"));
		LoginPage login = new LoginPage(driver);
		login.getLogin().click();
		WaitHandler.getExplicitWaitClicable(driver, login.getEmail());
		XXX.getcolor(driver, login.getEmail(), "yellow");
		login.getEmail().sendKeys(BaseConfig.getconfig("email"));
		XXX.getcolor(driver, login.getPass(), "black");
		login.getPass().sendKeys(BaseConfig.getconfig("pass"));
		Thread.sleep(3000);
		WaitHandler.getExplicitWaitClicable(driver, login.getSubmit());
		login.getSubmit().click();
		Thread.sleep(3000);
		if (login.getLogOut().size() > 0) {
			System.out.println("Login passes");
		} else {
			System.out.println("Login failed");
		}
		driver.getTitle();
		driver.quit();
	}
	
}
