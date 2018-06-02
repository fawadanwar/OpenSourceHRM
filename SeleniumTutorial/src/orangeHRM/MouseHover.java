package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.POMLogin;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
//		1. We Login to the website
//		2. Mouse Hover on Admin
//		3. Mouse Hover on User Management
//		4. Click on Users
//		5. Navigate back to the dashboard
//		6. Close the browser
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.logInButton(driver);
		
		WebElement Admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement UserManagment = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement Users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Admin).moveToElement(UserManagment).moveToElement(Users).click().build().perform();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
