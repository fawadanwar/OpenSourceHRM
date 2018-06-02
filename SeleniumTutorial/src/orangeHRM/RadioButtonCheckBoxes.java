package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin");
		
		WebElement LoginButton = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		LoginButton.click();
		
		WebElement Admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement UserManagment = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement Users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Admin).moveToElement(UserManagment).moveToElement(Users).click().build().perform();
		
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_6']"));
		checkBox1.click();
		
		Thread.sleep(2000);
		checkBox1.click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
