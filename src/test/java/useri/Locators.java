package useri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		// driver.get("https://www.saucedemo.com");
		// driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// driver.findElement(By.name("user-name")).sendKeys("Testing");
		// driver.findElement(By.className("form_input")).sendKeys("ClassTest");
		// driver.findElement(By.cssSelector("#user-name")).sendKeys("Csstest");
		// driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Xpathtest");
		// driver.findElement(By.tagName("input")).sendKeys("Tagname test");
		driver.get("https://www.selenium.dev/documentation/webdriver");
		driver.findElement(By.linkText("documentation/webdrive")).click();
	}

}
