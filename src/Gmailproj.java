import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.Highlight;

public class Gmailproj {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\SoftWares\\chromedriver.exe");
  
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.amazon.in/");
  
  JavascriptExecutor js=(JavascriptExecutor)driver;
  js.executeScript("window.scrollBy(0,2500)");
  Thread.sleep(2000);
  js.executeScript("window.scrollBy(2500,-2500)");

  Actions action=new Actions(driver);
  action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"))).build().perform();
  
  driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).click();
  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("sharan.patil71@gmail.com");
  driver.findElement(By.xpath("//span[@id='continue']")).click();
  driver.findElement(By.xpath("//input[contains(@id,'ap_password')]")).sendKeys("minds@22");
  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
  driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
  
  WebElement searchDropdownBox=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
  Select month=new Select(searchDropdownBox);
  month.selectByVisibleText("Appliances");
  
}

}
