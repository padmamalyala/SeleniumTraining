package useri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;

	public static String browser = "chrome";

	public static void main(String[] args) {
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			//driver object
			driver = new EdgeDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else
			System.out.println(" please find a Browser");
         //opening browser
		driver.get("https://www.saucedemo.com");// To launch particular url in the browser//
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	    //closing browser
		//driver.close();
		
	}

}
