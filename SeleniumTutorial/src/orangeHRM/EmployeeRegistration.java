package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.POMEmployeeRegistration;
import pageObjects.POMLogin;

public class EmployeeRegistration {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.logInButton(driver);
		
		POMEmployeeRegistration.PIM(driver);
		POMEmployeeRegistration.EmployeeList(driver);
		POMEmployeeRegistration.AddButton(driver);
		POMEmployeeRegistration.firstName(driver);
		POMEmployeeRegistration.lastName(driver);
		POMEmployeeRegistration.employeeID(driver);
		POMEmployeeRegistration.createLogDetChkbox(driver);
		POMEmployeeRegistration.Username(driver);
		POMEmployeeRegistration.Password(driver);
		POMEmployeeRegistration.CPassword(driver);
		POMEmployeeRegistration.SaveButton(driver);
		POMEmployeeRegistration.EditButton(driver);
		POMEmployeeRegistration.MaritalStatus(driver);
		POMEmployeeRegistration.genderSelection(driver);
		POMEmployeeRegistration.PDSaveButton(driver);
	
	
		
		
		
		
		
		
		
		
	}

}
