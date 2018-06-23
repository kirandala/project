package testcase;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

class testcase{
	public static WebDriver driver;
	
@BeforeTest
public void login() 
{
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/kirandalai/Downloads/chromedriver");
	  driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
	//Application was launched
		System.out.println("URL:"+ driver.getCurrentUrl());
}

@Test
public void loginapp()
{
 login();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.bigbasket.com/");
 
}





}