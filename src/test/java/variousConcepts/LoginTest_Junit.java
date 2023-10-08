package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	
	WebDriver driver;
    @Before
	public  void launchChrome()

	{ // System.setProperty("webdriver.chrome.driver",
		
		System.setProperty("webdriver.chrome.driver", "driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
    @After
	public  void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
	//	driver.close();
	//	driver.quit();
	}
    @Test
	public void positiveLoginTest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		

	}
    @Test
	public void negloginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
	}

}
