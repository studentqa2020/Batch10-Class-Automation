package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.xpath.pagefactory.LoginPageObjectModel;

public class AutomationLogin {

	public static WebDriver getlogin() throws Throwable{

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// up casting

		driver.get(BaseConfig.getConfigValue("URL"));// mostly
		driver.manage().window().maximize();

		LoginPageObjectModel pf = new LoginPageObjectModel(driver);

		Highlighter.getcolor(driver, pf.getLogin());
		pf.getLogin().click();

		Highlighter.getcolor(driver, pf.getEmail(),"green");
		pf.getEmail().sendKeys(BaseConfig.getConfigValue("email"));

		Highlighter.getcolor(driver, pf.getPassword(),"blue");
		pf.getPassword().sendKeys(BaseConfig.getConfigValue("pass"));

		Highlighter.getcolor(driver, pf.getFinalsignBtn(),"black");
		pf.getFinalsignBtn().click();
		
		return driver;
	}
		
}
