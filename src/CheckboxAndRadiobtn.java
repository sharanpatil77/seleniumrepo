import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxAndRadiobtn {

	@Test
	public void BoxandRadio() {
		
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
		
		
	}
	
	
}
