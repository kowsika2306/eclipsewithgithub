package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesForceChrome {

	public ChromeDriver driver;
	@Test
	public void salesforce()
	{
		/*
		 * ChromeOptions opt=new ChromeOptions();
		 * opt.addArguments("--disable-notifications"); ChromeDriver driver = new
		 * ChromeDriver(opt); driver.manage().window().maximize();
		 * driver.get("https://login.salesforce.com");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * driver.findElement(By.id("username")).sendKeys(
		 * "hari.radhakrishnan@qeagle.com");
		 * driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		 * driver.findElement(By.id("Login")).click();
		 */
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("content");
        driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
        WebElement chatter = driver.findElement(By.xpath("//a[@title='Chatter']"));
        driver.executeScript("arguments[0].click();", chatter);
        String title = driver.getTitle();
        System.out.println(title);
        String title2 = driver.getTitle();
        if(title2.contains(title))
        {
        	System.out.println("Title verified");
        }
        else
        {
        	System.out.println("Title Not Verified");
        }
        driver.findElement(By.xpath("(//span[@class='title'])[3]")).click();
        driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']")).sendKeys("what is data?");
        WebElement details = driver.findElement(By.xpath("//div[contains(@class,\"ql-editor ql-blank slds-rich-text-area\")]"));
        details.sendKeys("collection of values");
        driver.findElement(By.xpath("//button[@title='Click, or press Ctrl+Enter']")).click();
        WebElement myquestion = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]"));
        System.out.println(myquestion.getText());
        WebElement details1 = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[4]"));
        System.out.println(details1.getText());
        driver.close();
	}

}
