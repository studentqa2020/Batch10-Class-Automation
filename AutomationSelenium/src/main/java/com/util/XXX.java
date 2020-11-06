package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XXX {

	public static void getcolor(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver; // type casting polymorphism
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", element);

	}

	public static void getcolor(WebDriver driver, WebElement element, String color) {// OOPs ==> Polymorphism ==> Compile time
																				// poly
		JavascriptExecutor js = (JavascriptExecutor) driver; // type casting polymorphism
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 4px solid " + color + ";');",
				element);

	}

	public void getsalary() {

		// code
	}

	public static void getsalary(int a) {

		// code
	}
}