package com.unit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
  
public static void getcolor(WebDriver driver,WebElement element){
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid red;');", element);	
		
		}

public static void getcolor(WebDriver driver,WebElement element,String color ){
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 4px solid "+color+";');", element);	
		
		}




}
