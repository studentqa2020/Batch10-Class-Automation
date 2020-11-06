package com.page.factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  LoginPage {//Page Object Modal ==== PageFactory

	
	  public LoginPage(WebDriver driver) {
	  
	  PageFactory.initElements(driver, this);// Selenium dev added==>handle drivernull value 
	  }
	 

	@FindBy(xpath = "// *[@class='header_user_info']")
	private WebElement login;
	@FindBy(xpath = "//*[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//*[@id='passwd']")
	private WebElement pass;
	@FindBy(xpath = "//*[@id='SubmitLogin']")
	private WebElement submit;
	@FindBy(xpath="//*[class='search']")
	private WebElement search;
	
	@FindBy(xpath="//*[@class='logout']")
	private List<WebElement> logOut;



	public WebElement getSearch() {
		return search;
	}



	public List<WebElement> getLogOut() {
		return logOut;
	}



	public WebElement getsearch(){
		
	return 	search;
	}
	

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
