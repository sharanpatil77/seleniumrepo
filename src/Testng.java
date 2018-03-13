
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
    
	@Test (dependsOnMethods={"OpenBrowser"})
	 
	  public void SignIn() {
	 
		  System.out.println("This will execute second (SignIn)");
	 
	  }
	 
	  @Test
	 
	  public void OpenBrowser() {
	 
		  
		  System.out.println("This will execute first (Open Browser)");
	 
	  }
	 
	  @Test(dependsOnMethods={"SignIn"}) 
	 
	  public void LogOut() {
	 
		  System.out.println("This will execute third (Log Out)");
	 
	  }
}
