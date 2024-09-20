package useri;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://www.saucedemo.com/");
		//WebElement password = driver.findElement(By.id("password"));
		//driver.findElement(withTagName("input").above(password).sendKeys("Test");
	
	
	}

	
	}

	




