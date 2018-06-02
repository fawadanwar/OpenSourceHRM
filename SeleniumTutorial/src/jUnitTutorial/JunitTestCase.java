package jUnitTutorial;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.POMEmployeeRegistration;
import pageObjects.POMLogin;
import pageObjects.POMPIM;
import pageObjects.POMAdmin;

public class JunitTestCase {
	
	WebDriver driver;
	
	@Before
	public void before () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.logInButton(driver);
		System.out.println("This is Before method");
	}
	
	@Test
	public void MouseHoverAdmin () {
		
		POMAdmin.Admin(driver);
		POMAdmin.UserManagement(driver);
		POMAdmin.User(driver);
		System.out.println("Done with first test");
	}
	
	//@Test 
	public void MouseHoverPIM () {
		
		POMPIM.PIM(driver);
		POMPIM.EmployeeList(driver);
		System.out.println("Done with Second test");
	}
	
	@Test
	public void MouseHoverLeave () {
		
	}
	
	@Test
	public void MouseHoverTime () {
		
	}
	
	@After 
	public void after () throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
		System.out.println("This is After method");
	}
	
	
}
