package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	WebDriver driver;
	public Properties prop;
public   WebDriver initializeDriver() throws IOException
{
	prop=new Properties();
	FileInputStream propfile=new FileInputStream("C:\\Users\\Shyam\\OnCreate3D\\src\\main\\java\\resources\\datadriven.properties");
	prop.load(propfile);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Learning\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();

	}else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Learning\\Drivers\\geckodriver.exe");
		driver =new FirefoxDriver();
		
	}else if(browserName.equals("edge")){
		System.setProperty("webdriver.edge.driver", "G:\\Learning\\Drivers\\MicrosoftWebDriver.exe");
		driver =new EdgeDriver();
		
	}
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	return driver;
}




}
