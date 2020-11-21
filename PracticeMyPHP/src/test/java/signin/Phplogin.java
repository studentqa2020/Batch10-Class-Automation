package signin;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Phplogin {

public static void main(String[] args) {
	
System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
WebDriver driver = new FirefoxDriver();

driver.get("https://www.phptravels.net/home");
driver.manage().window().maximize();

WebElement myaccount = driver.findElement(By.xpath("(//*[@class='btn btn-text-inherit btn-interactive'])[3]"));
myaccount.click();			

WebElement login = driver.findElement(By.xpath("//*[@class='dropdown-item active tr']"));
login.click();	

WebElement emeil = driver.findElement(By.xpath("//*[@name='username']"));
emeil.sendKeys("susmita.z.nishir@gmail.com");

WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
pass.sendKeys("S12345678");

WebElement finallogin = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block loginbtn']"));
finallogin.click();

}


}
	

	
	
	
	

