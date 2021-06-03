package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void test1() {
	  
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.website.com/sign-in");
		driver.manage().window().maximize();
		String x= driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,x);
  }
  @Test
  public void test(){
	  	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.website.com/sign-in");
		driver.manage().window().maximize();
		String x= driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,"x1");
	  
  }
}
