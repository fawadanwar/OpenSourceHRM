package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class POMAdmin {
	
	static WebElement element = null;
	
	public static void Admin (WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();							
	} 
	
	public static void UserManagement (WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();							
	} 
	
	public static void User (WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}

}
