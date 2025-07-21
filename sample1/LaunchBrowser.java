package sample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Id
		WebElement element = driver.findElement(By.id("username")); //30-1 29
		element.sendKeys("demo");//30-25 5
		element.clear();//30 0.1
		
		Thread.sleep(3000);
		element.sendKeys("demosalesmanager");//30
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		String text = driver.findElement(By.tagName("label")).getText();
		System.out.println(text);
		driver.findElement(By.partialLinkText("CR")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		WebElement username=driver.findElement(By.id("createLeadForm_companyName"));
		
		
		username.sendKeys("vishwanathan");
		username.clear();
		username.sendKeys("testleaf");
		
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("dharani");
	
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
