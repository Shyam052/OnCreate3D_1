package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	By headertop=By.id("header-top");
	By headerholder=By.id("header-holder");
	By middlePageWithText=By.xpath("//*[@id='features']");
	By footer=By.xpath("//*[@id='footer']");
	By login=By.xpath("//*[@id='header-top']/div/div[2]/a[2]");
	


	public WebElement headertop()
	{
	return driver.findElement(headertop);
	
	}
	

	public WebElement headerholder()
	{
	return driver.findElement(headerholder);
	
	}
	
	public WebElement middlePageWithText()
	{
	return driver.findElement(middlePageWithText);
	
	}
	

	public WebElement footer()
	{
	return driver.findElement(footer);
	
	}
	public WebElement login()
	{
	return driver.findElement(login);
	
	}
	
	
	

}
