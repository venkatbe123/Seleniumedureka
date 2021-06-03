import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.website.com/sign-in");
		driver.manage().window().maximize();
		String x= driver.getTitle();
		System.out.println(x);
		driver.findElement(By.id("username")).sendKeys("Edureka");
		driver.findElement(By.name("password")).sendKeys("test");
	}

}
