package testcasespackage;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class HomePageDumpLinks extends resources.base {
WebDriver driver;
	
@BeforeMethod
public void browserInitialize() throws IOException
{
	driver=initializeDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	
	
}



public void headerToplinks()

{
	 
	//driver.get(prop.getProperty("url"));
	LandingPage lp=new LandingPage(driver);
	int size=lp.headertop().findElements(By.tagName("a")).size();
	for(int i=0;i<=size-1;i++)
	{
		lp.headertop().findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
	}
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		
		System.out.println(driver.getTitle());
	
		
	}
}

@Test
public void headerholder()

{
	 
	//driver.get(prop.getProperty("url"));
	LandingPage lp=new LandingPage(driver);
	int size=lp.headerholder().findElements(By.tagName("a")).size();
	for(int i=0;i<=size-1;i++)
	{
		lp.headerholder().findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			AllTextP();
			
			
		}
	 System.out.println("------------------------------------------------------");
	
}
private void AllTextP() {
	// TODO Auto-generated method stub
	{
		//tagname P
		//driver.get(prop.getProperty("url"));

		int size=driver.findElements(By.tagName("p")).size();
		for(int i=0;i<=size-1;i++)
		{
			String text=driver.findElements(By.tagName("p")).get(i).getText();
			
		 System.out.println(text);
		}
		 System.out.println("---------------------------------------------");
	}
}




public void middlePageWithText()

{
	 
	//driver.get(prop.getProperty("url"));
	LandingPage lp=new LandingPage(driver);
	int size=lp.middlePageWithText().findElements(By.tagName("a")).size();
	for(int i=0;i<=size-1;i++)
	{
		lp.middlePageWithText().findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			AllTextP();
			
		}
	 System.out.println("------------------------------------------------------");
	
}

public void footer()

{
	 
	//driver.get(prop.getProperty("url"));
	LandingPage lp=new LandingPage(driver);
	int size=lp.footer().findElements(By.tagName("a")).size();
	for(int i=0;i<=size-1;i++)
	{
		lp.footer().findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
	 System.out.println("---------------------------------------------");
}



@AfterMethod
private void teardown() {
	// TODO Auto-generated method stub
	driver.quit();
	driver=null;
	
}





	
	
}
