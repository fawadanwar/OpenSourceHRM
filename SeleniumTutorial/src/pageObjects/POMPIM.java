package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class POMPIM {
	
static WebElement element = null;
	
	public static void PIM (WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();							
	}
	
	public static void EmployeeList (WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}

}
