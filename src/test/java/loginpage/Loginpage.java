package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginpage {
	@Test
	public void login() {
		  
		  System.setProperty("webdriver.chrome.driver", "/Users/kirandalai/Downloads/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
			System.out.println("URL:"+ driver.getCurrentUrl());
			driver.manage().window().maximize();
		//Application was launched
			
	}
}
