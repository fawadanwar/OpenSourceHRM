package jUnitTutorial;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Annotations {

	@BeforeAll
	public static void setUpBeforeClass()  {
		System.out.println("This is Before All Method");
	}
	
	@BeforeEach
	public void setUp()  {
		System.out.println("This is Before Each Method");
	}
	
	@Test
	public void test1() {
		System.out.println("This is Test Method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is Test Method 2");
	}
	
	@AfterEach
	public void tearDown()  {
		System.out.println("This is After Each Method");
	}

	@AfterAll
	public static void tearDownAfterClass()  {
		System.out.println("This is After All Method");
	}

	

	

	

}
