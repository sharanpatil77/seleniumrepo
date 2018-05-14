import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumtest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SoftWares\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sharan.patil77@outlook.com");
        driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("minds123");
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
        
        driver.findElement(By.xpath(".//*[@id='search_query_top']")).sendKeys("Faded Short Sleeve T-shirts");
        driver.findElement(By.xpath(".//*[@id='searchbox']/button")).click();
       /* driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
        driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();*/
        
        
        Actions action =new Actions(driver);
        
        WebElement ele=driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
        action.moveToElement(ele).perform();
        
        driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
        driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
        driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button")).click();
        driver.findElement(By.xpath(".//*[@id='cgv']")).click();
        driver.findElement(By.xpath(".//*[@id='form']/p/button")).click();
        System.out.println("Test Passed Successfully");
        
        
        
	}

}
