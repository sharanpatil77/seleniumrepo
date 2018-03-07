import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.FileUtils;

public class Amaze {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
	
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'/gp/goldbox/ref=nav_cs_gb')]")).click();
		
		
		// verify that the “check box” is enabled
		
			            
		        Thread.sleep(9000);
			              boolean searchIconEnabled = driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[4]")).isEnabled();
		
			 
		
			              if (searchIconEnabled==true)
		
	              {
		
			                     // click on the search button
		
		
			            	  driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[4]")).click();
			          		
		
			              }
			              
			    java.util.List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
			    
			    System.out.println(checkboxes.size());
		
		
		/*driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		
		driver.findElement(By.xpath("(//img[contains(@class,'s-access-image cfMarker')])[1]")).click();
		
		
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window

		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]")).click();
		
		
		// Switch back to original browser (first window)
		//driver.switchTo().window(winHandleBefore);

		Thread.sleep(5000);
		Actions action=new Actions(driver);
		
		WebElement element=driver.findElement(By.xpath("//a[contains(@id,'nav-link-yourAccount')]"));
		action.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//a[contains(@href,'/gp/css/homepage.html/ref=nav_youraccount_ya')]")).click();
		
		
		WebElement element1 =driver.findElement(By.xpath("(//div[contains(@class,'a-column a-span9 a-span-last')])[4]"));
		action.contextClick(element1).perform();*/
		
		
		
	}

}
