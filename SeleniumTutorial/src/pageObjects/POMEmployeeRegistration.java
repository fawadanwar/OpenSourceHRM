package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class POMEmployeeRegistration {
	
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
	
	public static void AddButton (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='btnAdd']"));
		element.click();
	}
	
	public static void firstName (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='firstName']"));
		element.sendKeys("Raj");
	}
	
	public static void lastName (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='lastName']"));
		element.sendKeys("Kapoor");
	}
	
	public static void employeeID(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='employeeId']"));
		element.clear();
		element.sendKeys("101");
	}
	
	public static void Username (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='user_name']"));
		element.sendKeys("RajKapoor");
	}
	
	public static void Password (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='user_password']"));
		element.sendKeys("rajkapoor");
	}
	
	public static void CPassword (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='re_password']"));
		element.sendKeys("rajkapoor");
	}
	
	public static void createLogDetChkbox (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='chkLogin']"));
		element.click();
	}
	
	public static void SaveButton (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='btnSave']"));
		element.click();
	}
	
	public static void EditButton (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='btnSave']"));
		element.click();
	}
	
	public static void MaritalStatus (WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
		Select sel = new Select (element);
		sel.selectByVisibleText("Single");
	
	}
	
	public static void genderSelection (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='personal_optGender_1']"));
		element.click();
		
	}	
	
	public static void PDSaveButton (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='btnSave']"));
		element.click();
	}
	
	public static void quitBrowser (WebDriver driver) {
		driver.quit();
	}
	
	public static void EmployeeSearch (WebDriver driver) {
		element = driver.findElement(By.xpath("//td/a[contains(text(),'0001')]"));
		element.click();
	}
	
	public static void LicExpCalendarImage (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']/following-sibling::img"));
		element.click();
	}
	
	public static void LicExpCalendarMonth (WebDriver driver) {
		element = driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-month') and contains (@onchange,'#personal_txtLicExpDate')]"));
		Select month = new Select (element);
		month.selectByVisibleText("Jul");
	}
	
	public static void LicExpCalendarYear (WebDriver driver) {
		element = driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-year') and contains (@onchange,'#personal_txtLicExpDate')]"));
		Select year = new Select (element);
		year.selectByVisibleText("2019");	
	}
	
	public static void LicExpCalendarDate (WebDriver driver) {
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement ele:allDates)
		{		
			String date=ele.getText();
			if(date.equalsIgnoreCase("17"))
			{
				ele.click();
				break;
			}
			
		}
		//table[@class='ui-datepicker-calendar']//td
	}
		
			
		
		
	
				
			
				
}
	


