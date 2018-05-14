
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

		System.out.println("This is the Test Case1 A");

	}

	@Test

	public void testCase2() {

		System.out.println("This is the Test Case2 B");

	}

	@BeforeMethod

	public void beforeMethod() {

		System.out.println("This will execute before every Method  D ");

	}

	@AfterMethod

	public void afterMethod() {

		System.out.println("This will execute after every Method  C");

	}

	@BeforeClass

	public void beforeClass() {

		System.out.println("This will execute before the Class  E ");

	}

	@AfterClass

	public void afterClass() {

		System.out.println("This will execute after the Class  F");

	}

	@BeforeTest

	public void beforeTest() {

		System.out.println("This will execute before the Test  G ");

	}

	@AfterTest

	public void afterTest() {

		System.out.println("This will execute after the Test  H ");

	}

	@BeforeSuite

	public void beforeSuite() {

		System.out.println("This will execute before the Test Suite   I ");

	}

	@AfterSuite

	public void afterSuite() {

		System.out.println("This will execute after the Test Suite  J ");

	}
	
	

}
