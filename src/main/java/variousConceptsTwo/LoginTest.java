package variousConceptsTwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		launchBrowser();
		loging();
		tearDown();
		
		launchBrowser();
		negLogTest();
		tearDown();
		
	}
		
		public static void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mwamb\\Selenium\\1stSelenium\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			

			//Clear cookies
			driver.manage().deleteAllCookies();
			
			//got to url
			driver.get("http://techfios.com/billing/?ng=admin");
			//maximize window
			
			driver.manage().window().maximize();
			
			//apply implicity
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		public static void loging() {
			//identify user and insert value
			
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			
			//identify password and insert value
			
			driver.findElement(By.id("password")).sendKeys("abc123");
			
			
			//identify log in button and click
			
			driver.findElement(By.name("login")).click();
		}
		
		public static void negLogTest() {
			//identify user and insert value
			
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			
			//identify password and insert value
			
			driver.findElement(By.id("password")).sendKeys("abc123");
			
			
			//identify log in button and click
			
			driver.findElement(By.name("login")).click();
			
		}
			public static void tearDown() {
			
			//close browser
			driver.close();
			driver.quit();
			}
		}

		
	
