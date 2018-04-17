package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	
	By username=By.xpath(".//*[@id='usernameOrEmail']");
	By button=By.xpath(".//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[2]/button");
    By password=By.xpath(".//*[@id='password']");
	By login=By.xpath(".//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[2]/button");

	
	public Loginpage(WebDriver driver) 
	
	{
		
		this.driver=driver;
		
		
	}
	
	
	public void typeusername()
	{
		
		driver.findElement(username).sendKeys("admin");
		
		
	}
	
	
	public void clickbutton()
	{
		
		driver.findElement(button).click();;
		
	}
	
	
	public void typepassword()
	{
		
		driver.findElement(password).sendKeys("12345");;
		
	}
	
	
	public void clicklogin()
	{
		
		driver.findElement(login).click();;
		
	}
	
	
}
