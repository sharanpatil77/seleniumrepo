
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumTestNg {
	
	
		
	@Test
	 public void myTestMethod() {
	 System.out.println("Inside method:- myTestMethod");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://www.seleniumframework.com/Practiceform/");
	 String title = driver.getTitle();
	 System.out.println(title);
	 driver.quit();
	 }
	  
	 @BeforeMethod
	 public void beforeMethod() {
	 System.out.println("This piece of code is executed before method:- myTestMethod");
	 System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
	 }
	 
	 @AfterMethod
	 public void afterMethod() {
	 System.out.println("This piece of code is executed after method:- myTestMethod");
	 }
	 
	 @BeforeClass
	 public void beforeClass() {
	 System.out.println("This piece of code is executed before the class is executed");
	 }
	 
	 @AfterClass
	 public void afterClass() {
	 System.out.println("This piece of code is executed after the class is executed");
	 }
	

		
}
	