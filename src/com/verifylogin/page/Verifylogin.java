package com.verifylogin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.pom.pages.Loginpage;

public class Verifylogin {

	@Test
	public void logintest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		Thread.sleep(5000);
		
		Loginpage login=new Loginpage(driver);
		
		login.typeusername();
		login.clickbutton();
		Thread.sleep(5000);
		login.typepassword();
		login.clicklogin();
		
		driver.wait(10000);
		
	}
	
	
	
	
}
