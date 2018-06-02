package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys("Fawad");
		Thread.sleep(2000);
		driver.quit();
	}

}
