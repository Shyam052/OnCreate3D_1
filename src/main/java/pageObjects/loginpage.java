package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

WebDriver driver;

public loginpage (WebDriver driver)
{
	this.driver=driver;
}

	
By username=By.xpath("//*[@id='Email']");
By password=By.xpath("//*[@id='Password']");
By signin=By.xpath("//*[@id='btnSubmit']");
By Error=By.xpath("//div[contains(@class,'validation-summary-errors')]");
String ExpectedText="Please enter a valid e-mail address";
String ExpectedError= "Invalid username or password.";
String ExpectedUrl="https://oncreate3d.azurewebsites.net/";

public WebElement username()
{
	return driver.findElement(username);
}


public WebElement password()
{
	return driver.findElement(password);
}

public WebElement signin()
{
	return driver.findElement(signin);
}

public WebElement Error()
{
	return driver.findElement(Error);
}



	
	
}
