package signin;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rentcom {
   
public static void main(String[] args) {

	
System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.rent.com/");
driver.manage().window().maximize();

WebElement signin = driver.findElement(By.xpath("//*[@class='btn ml-15 hidden md:block p-0 h-20']"));
signin.click();
List<WebElement> emailbtn = driver.findElements(By.xpath("//*[@class='_1FS-Q _149ZD _3hvGH']"));
emailbtn.get(0).click();
List<WebElement> email = driver.findElements(By.xpath("(//*[@class='TTnsN'])"));
email.get(1).sendKeys("susmita.z.nishir@gmail.com");
//List<WebElement> passbtn = driver.findElements(By.xpath("(//*[@class='_1FS-Q _149ZD _3hvGH']"));
//passbtn.get(1).click();
WebElement pass = driver.findElement(By.xpath("//*[@id='password-50029']"));
pass.sendKeys("S12345678");

}	
	
	
	
	
	
	
	
}
