package testcasespackage;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class HomePageDump extends resources.base {
WebDriver driver;
	
@BeforeMethod
public void browserInitialize() throws IOException
{
	driver=initializeDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));

}



public void allHeaderTopLinks()

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
		/*allListInWithP();
		allListInWithA();
		allListInWithH4();
		allListInWithH5();*/
		
		
		
	}
}

@Test
public void allHeaderHolderLinks()

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
			allListInWithP();
			allListInWithA();
			allListInWithH4();
			allListInWithH5();
			
		}
	
	
}
@Test
public void allMiddleAreaLinks()

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
			allListInWithP();
			allListInWithA();
			allListInWithH4();
			allListInWithH5();
		}
	
	
}

public void allFooterLinks()

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
			/*allListInWithP();
			allListInWithA();
			allListInWithH4();
			allListInWithH5();*/
		}
	
}



	public void allListInWithP()

	{
		//tagname P
		//driver.get(prop.getProperty("url"));

		int size=driver.findElements(By.tagName("p")).size();
		for(int i=0;i<=size-1;i++)
		{
			String text=driver.findElements(By.tagName("p")).get(i).getText();
			
		 System.out.println(text);
		}
		
	}
public void allListInWithA()

	{
		//tagname P
		//driver.get(prop.getProperty("url"));
		
		int size=driver.findElements(By.tagName("a")).size();
		for(int i=0;i<=size-1;i++)
		{
			String text=driver.findElements(By.tagName("a")).get(i).getText();
			
		 System.out.println(text);
		}
	
	}
	
public void allListInWithH4()

	{
		//tagname P
		//driver.get(prop.getProperty("url"));
		
		int size=driver.findElements(By.tagName("h4")).size();
		for(int i=0;i<=size-1;i++)
		{
			String text=driver.findElements(By.tagName("h4")).get(i).getText();
			System.out.println(text);
		}

	}

public void allListInWithH5()

	{
		//tagname P
		//driver.get(prop.getProperty("url"));
		
		int size=driver.findElements(By.tagName("h5")).size();
		for(int i=0;i<=size-1;i++)
		{
			String text=driver.findElements(By.tagName("h5")).get(i).getText();
			
		 System.out.println(text);
		}
		
	}
	
public void allListInWithTd()

	{
		//tagname P
		//driver.get(prop.getProperty("url"));
		
		int size=driver.findElements(By.tagName("td")).size();
		for(int i=0;i<=size-1;i++)
		{
			String text=driver.findElements(By.tagName("td")).get(i).getText();
			
		 System.out.println(text);
		}
	
	}

public void allListInWithSpan()

	{
		//tagname P
		//driver.get(prop.getProperty("url"));
		
		int size=driver.findElements(By.tagName("span")).size();
		for(int i=0;i<=size-1;i++)
		{
			String text=driver.findElements(By.tagName("span")).get(i).getText();
			
		 System.out.println(text);
		}
		
	}

	
	

@AfterMethod
private void teardown() {
	// TODO Auto-generated method stub
	driver.quit();
	driver=null;
	
}

}