package sample

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
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		
		
		WebElement name=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		name.getText();
		System.out.println("Sauce Labs Backpack");
		
		
		WebElement price=driver.findElement(By.xpath("//div[text()='29.99']"));
		price.getText();
		System.out.println("29.99");
		
		
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("dharani");
		driver.findElement(By.xpath("//input[@data-test='lastName']")).sendKeys("dharani");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Zip/Postal')]")).sendKeys("605766");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		
		File dest=new File("screenshot.png");
		
		try {
			FileHandler.copy(src, dest);
			System.out.println("Screenshot saved successfully");
		}
		catch(IOException e) {
			System.out.println("Error saving screenshot:" + e.getMessage());
			
			
		}
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
