package signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhpSignIn {

public static void main(String[] args) {
	
System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");	
WebDriver driver = new FirefoxDriver();
driver.get("https://www.phptravels.net/home");	
driver.manage().window().maximize();	
	
WebElement myaccount = driver.findElement(By.xpath("(//*[@class='btn btn-text-inherit btn-interactive'])[3]"));	
myaccount.click();	
WebElement signup = driver.findElement(By.xpath("//*[@class='dropdown-item tr']"));	
signup.click();	
WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));	
firstname.sendKeys("susmita");	
WebElement lastname = driver.findElement(By.xpath("//*[@name='lastname']"));
lastname.sendKeys("nishir");
WebElement mobno = driver.findElement(By.xpath("//*[@name='phone']"));
mobno.sendKeys("7323721622");
WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
email.sendKeys("susmita.z.nishir@gmail.com");
WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
pass.sendKeys("S12345678");
WebElement confirmpass = driver.findElement(By.xpath("//*[@name='confirmpassword']"));
confirmpass.sendKeys("S12345678");
WebElement finalsignup = driver.findElement(By.xpath("//*[@class='signupbtn btn_full btn btn-success btn-block btn-lg']"));
finalsignup.click();


}	
	
	
	
	
	
	
}
