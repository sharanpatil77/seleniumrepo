import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class DateandTime {

	
	@Test
	public void datemethod() {
		
		System.setProperty("webdriver.chrome.driver","E:\\SoftWares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
        //
		/*actualtitle=driver.getTitle();
		System.out.println("actual Title is ---"+actualtitle );*/
		
		String title = driver.getTitle();
		System.out.println(title);
		 
		driver.findElement(By.xpath("//span[contains(@class,'fl icon-calendar_icon-new icon-onward-calendar icon')]")).click();
		
		WebElement ele=driver.findElement(By.xpath("(//*[contains(@class,'current day')])[2]"));
		ele.click();
	
		
	}
	
	
	
	
}
