package testcasespackage;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.loginpage;


public class LoginTestCases extends resources.base{
WebDriver driver;
@BeforeMethod
public void startDriver() throws IOException
{
	driver=initializeDriver();
	driver.get(prop.getProperty("url"));
	
}
	
@Test
public void correctLogin()
{
LandingPage landingpage=new LandingPage(driver);
landingpage.login().click();
Set<String> abc=driver.getWindowHandles();
Iterator<String> it=abc.iterator();
String parent = it.next();
String child=it.next();
driver.switchTo().window(child);

loginpage logPage =new loginpage(driver);
logPage.username().sendKeys("shyamkumar.ranganathan@gmail.com");
logPage.password().sendKeys("1hyam123@");
logPage.signin().click();
String currenturl=driver.getCurrentUrl();
System.out.println(currenturl);

if(currenturl=="https://oncreate3d.azurewebsites.net/OC3DDashboard/OC3DDashboardView")
{
assertTrue(true);
System.out.println("The Correct EmailId and Password entered");

}else{
	assertTrue(false);
	System.out.println("The Correct EmailId and Password but no login");
	
}

	
}
	
	

}
