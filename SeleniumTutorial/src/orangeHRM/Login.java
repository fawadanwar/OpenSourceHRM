package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.POMLogin;


public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.logInButton(driver);
		
		
	}

}
