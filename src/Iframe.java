import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe {
@Test
	public void iFrameMethod() {
		
		System.setProperty("webdriver.chrome.driver","E:\\SoftWares\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		//First find the element using any of locator stratergy
		WebElement iframeElement = driver.findElement(By.id("IF1"));
 
		//now use the switch command
		driver.switchTo().frame(0);
 
		//Do all the required tasks in the frame 0
		//Switch back to the main window
		driver.switchTo().defaultContent();
		driver.quit();
		
		
		
	}
	
	
}
