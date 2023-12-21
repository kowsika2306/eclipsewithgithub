package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BaseClass {
	
	public ChromeDriver driver;
	
	@BeforeTest
	public void precondition()
	{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf$1234");
	driver.findElement(By.id("Login")).click();

}
	@AfterTest
	public void postcondition()
	{
		driver.close();
	}
	
	
}
