package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
//		// We are typing Admin as username, then clearing it and then typing Admin again as username
//		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Admin");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Admin");
//		Thread.sleep(2000);
//		
//		//We are typing admin as password, then clearing it and then typing it back as password
//		
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
//		
//		
//		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
	// *********************************************************************************
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Fawad");
		Thread.sleep(1000);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("Mohammad");
		Thread.sleep(1000);
		password.clear();
		Thread.sleep(1000);
		password.sendKeys("admin");
		
		WebElement logIn = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		logIn.click();
							
		
		
		
		
		
		
		
	}

}
