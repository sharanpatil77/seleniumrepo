import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class Naukriautomate {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver","E:\\SoftWares\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
       
        WebDriver driver= new ChromeDriver(chromeOptions);
		
		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
        //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
       
		Thread.sleep(5000);
       
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		 
		// This will return the number of windows opened by Webdriver and will return Set of St//rings
		Set<String>s1=driver.getWindowHandles();
		 
		// Now we will iterate using Iterator
		Iterator<String> I1= s1.iterator();
		 
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		 
		// Here we will compare if parent window is not equal to child window then we will close
		 
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		 
		System.out.println(driver.switchTo().window(child_window).getTitle());
		 
		driver.close();
		}
		 
		}
		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent);
		 
		
        
		
		driver.findElement(By.xpath("//span[contains(@class,'topIcon jobs Login')]")).click();
	
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("sharan.patil71@gmail.com");
		driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("password@22");
		driver.findElement(By.xpath("//button[@class='blueBtn']")).click();
		Thread.sleep(6000);

        /*WebElement element = driver.findElement(By.xpath("(//span[contains(@class,'topIcon jobs')])[1]"));
            Actions action = new Actions(driver);
            action.moveToElement(element).build().perform();
             driver.findElement(By.xpath("(//a[contains(@title,'Browse All Jobs')])[1]")).click();
             Thread.sleep(5000);
             
             java.util.Set<String> handle=driver.getWindowHandles();
            for (String handle1:driver.getWindowHandles()){
    	   
    	   System.out.println(handle1);
    	   driver.switchTo().window(handle1);
       }
       
       driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("Manual Testing ");
       driver.findElement(By.xpath("(//input[contains(@class,'sugInp w135')])[1]")).sendKeys("hyderabad");
       driver.findElement(By.xpath("//button[@id='qsbFormBtn']")).click();
		*/
		driver.findElement(By.xpath("(//a[contains(@href,'editSummary')])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@value,'Save Changes')]")).click();
        Thread.sleep(2000);		
		 driver.findElement(By.xpath("//a[contains(@href,'//my.naukri.com/Profile/view/')]")).click();
		 Thread.sleep(5000); 
		 driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
		 driver.findElement(By.xpath(".//*[@id='attachCV']")).sendKeys("C:\\Users\\Irshad1\\Desktop\\ReaD\\Resume\\Sharan Patil 3.8 yrs  Manual and Selenium.docx");
		 Thread.sleep(8000); 
		 driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File file= ts.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(file, new File("D:\\shot.jpeg"));
		System.out.println("Captured screen shot");
		
		/*Actions action= new Actions(driver);
		WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[2]"));
		action.contextClick(element).perform();
		System.out.println("Right Click Performed on Element");	*/	
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		
		Thread.sleep(5000);
		JavascriptExecutor jsr = (JavascriptExecutor)driver;
		jsr.executeScript("window.scrollBy(0,-2500)", "");
		
		
	}

}
