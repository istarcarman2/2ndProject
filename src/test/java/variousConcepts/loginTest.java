package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		launchChrome();
		positiveLoginTest();
		closeBrowser();
		
		launchChrome();
		negloginTest();
		closeBrowser();				
	}
	
	public static void launchChrome()
	
	{   //	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\javaconcepts\\crm\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver\\\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}
     public static void closeBrowser() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.close();
     }
 
     public static void positiveLoginTest() {

        driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
        driver.findElement(By.name("password")).sendKeys("abc123");
        driver.findElement(By.name("login")).click();
  
        }
    public static void negloginTest() {
    	 driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
         driver.findElement(By.name("password")).sendKeys("abc1234");
         driver.findElement(By.name("login")).click();
    }
    	
    }
    