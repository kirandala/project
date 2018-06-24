package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginpage {
	
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
	
	System.out.println("login sucess");
	}
}
