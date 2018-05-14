import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        
        
        
	}

}
