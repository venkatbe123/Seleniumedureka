import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class explicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
	}

}
