package com.oops.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTravel {
	
	public static void main(String[] args) throws Throwable {
	
     System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");      
     WebDriver driver = new ChromeDriver();//up casting
     
     driver.get("https://www.phptravels.net/home");// mostly 
     driver.manage().window().maximize();
     
     List<WebElement> a =driver.findElements(By.xpath("//*[@class='btn btn-text-inherit btn-interactive']"));     
     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", a.get(2));
     a.get(2).click();

     
    //*[@class='btn btn-text-inherit btn-interactive'] 1 of 3
   //*[@class='dropdown dropdown-login dropdown-tab']
     
     
     
     
     
     
     
     
     
          
//     WebElement login =driver.findElement(By.xpath("//*[@class='dropdown-item active tr']"));
//     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", signBtn);
//     login.click();
//     
//     WebElement email =driver.findElement(By.xpath("//*[@id='email']"));
//     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", email);
//     email.sendKeys("sarowerny@gmail.com");
//     //password
//     
//     WebElement password =driver.findElement(By.xpath("//*[@id='passwd']"));
//     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", password);
//     password.sendKeys("student");
//     
//     //password.submit();
//     WebElement finalsignBtn =driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
//     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", finalsignBtn);
//     finalsignBtn.click();
	}

}
