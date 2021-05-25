package loginpage;

import java.util.concurrent.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loginpage {

	public static WebDriver driver;

	@BeforeTest
	public void login() {
		System.setProperty("webdriver.chrome.driver", "/Users/kirandalai/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// Application was launched
		System.out.println("URL:" + driver.getCurrentUrl());

	}

	@Test
	public void loginapp() {
		System.out.println("login sucess");
	}

	@Test
	@Parameters({"list1","list2"})
	public void searchproduct(String list1, String list2) {
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys(list1);
		Assert.assertEquals(list1,"Mangoes");
		driver.findElement(By.xpath("//input[@qa='searchBar']")).clear();
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys(list2);
		Assert.assertEquals(list2,"Potatos");
		
	}
}






