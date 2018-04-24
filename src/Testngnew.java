
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testngnew {
	
	@Test
	 
	public void testCase1() {

		System.out.println("This is the Test Case1 JAGUAR");

	}

	@Test

	public void testCase2() {

		System.out.println("This is the Test Case2 PORSCHE");

	}

	@BeforeMethod

	public void beforeMethod() {

		System.out.println("This will execute before every Method  BMW ");

	}

	@AfterMethod

	public void afterMethod() {

		System.out.println("This will execute after every Method  BENTLY");

	}

	@BeforeClass

	public void beforeClass() {

		System.out.println("This will execute before the Class  RITZ ");

	}

	@AfterClass

	public void afterClass() {

		System.out.println("This will execute after the Class  BENZ");

	}

	@BeforeTest

	public void beforeTest() {

		System.out.println("This will execute before the Test  FORD ");

	}

	@AfterTest

	public void afterTest() {

		System.out.println("This will execute after the Test  FERRARI ");

	}

	@BeforeSuite

	public void beforeSuite() {

		System.out.println("This will execute before the Test Suite  ASTON MARTIN ");

	}

	@AfterSuite

	public void afterSuite() {

		System.out.println("This will execute after the Test Suite   NEXON ");

	}
	
	

}
