package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.website.com/sign-in");
		driver.manage().window().maximize();
  }
  
  @Test
  public void test1() {	
	    String x= driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,x);
  }
  
  @Test
  public void test(){
	  String x= driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,"x1");
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }
}

