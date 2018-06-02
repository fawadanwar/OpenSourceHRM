package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectBy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		
		// Providing Username
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Admin");
		
		//Providing Password
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin");
		
		//Clicking login button
		WebElement LoginButton = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		LoginButton.click();
		
		//Mouse Hovering
		WebElement Admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement UserManagment = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement Users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Admin).moveToElement(UserManagment).moveToElement(Users).click().build().perform();
		
		WebElement userRoleDD = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		
		WebElement statusDD = driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
		
		//ClassB CB = new ClassB();
		
		Select userRoleSelect = new Select (userRoleDD);
		
		userRoleSelect.selectByIndex(1);
		
		Thread.sleep(2000);
		
		userRoleSelect.selectByValue("2");
		
		Thread.sleep(2000);
		
		Select statusSelect = new Select (statusDD);
		
		statusSelect.selectByVisibleText("Enabled");
		
		Thread.sleep(2000);
		
		statusSelect.selectByValue("0");
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
