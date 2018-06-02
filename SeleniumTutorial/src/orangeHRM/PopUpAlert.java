package orangeHRM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
	}

}
