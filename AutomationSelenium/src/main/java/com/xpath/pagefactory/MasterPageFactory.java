package com.xpath.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	
	public MasterPageFactory(WebDriver driver){
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@class='login']")//selenium
	private WebElement signBtn;
	@FindBy(xpath ="//*[@id='email']")//selenium
	private WebElement email;
	@FindBy(xpath ="//*[@id='passwd']")//selenium
	private WebElement password;
	@FindBy(xpath ="//*[@id='SubmitLogin']")//selenium
	private WebElement finalSignin;
	
	@FindBy(xpath ="//*[@class='cart']")//selenium
	private WebElement cart;
	

	public WebElement getCart() {
		return cart;
	}

	public WebElement getFinalSignin() {
		return finalSignin;
	}

	public WebElement getSignBtn() {
		
		return signBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	
}
