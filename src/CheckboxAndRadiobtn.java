import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckboxAndRadiobtn {

	@Test
	public void BoxandRadio() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\SoftWares\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php");
		  driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		
		  
		  WebElement option1=driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_1']"));
		
		if(option1.isSelected()) {
			System.out.println("CheckBox is Toggled ON");
			
			}
			else {
				
				System.out.println("CheckBox is Toggled OFF");
				option1.click();
		}
		
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"))).build().perform();
		
		driver.findElement(By.xpath("//a[contains(@class,'button lnk_view btn btn-default')]")).click();
		action.doubleClick(driver.findElement(By.xpath("//a[contains(@class,'btn btn-default button-plus product_quantity_up')]"))).perform();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("E:\\screenshots.jpeg"));
		
		
		
	}
	
	
}
