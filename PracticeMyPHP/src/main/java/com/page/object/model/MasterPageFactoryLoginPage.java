package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactoryLoginPage {
public	MasterPageFactoryLoginPage(WebDriver driver){
PageFactory.initElements(driver, this);		
	}

@FindBy(xpath="(//*[@class='btn btn-text-inherit btn-interactive'])[3]")
private WebElement myaccount;	
@FindBy(xpath="//*[@class='dropdown-item active tr']")	
private WebElement login;	
@FindBy(xpath="//*[@name='username']")	
private WebElement email;	
@FindBy(xpath="//*[@name='password']")
private WebElement pass;
@FindBy(xpath="//*[@class='btn btn-primary btn-lg btn-block loginbtn']")
private WebElement finallogin;

public WebElement getMyaccount() {
	return myaccount;
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
public WebElement getFinallogin() {
	return finallogin;
}




}
