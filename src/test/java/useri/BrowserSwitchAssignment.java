package useri;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSwitchAssignment {

	public static WebDriver driver;
	public static String browser = "edge";

	public static void main(String[] args) {
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("http://testautomationpractice.blogspot.com/");
		driver.findElement(By.cssSelector("input.wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input.wikipedia-search-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Selenium in biology")).click();
		driver.findElement(By.linkText("Selenium (software)")).click();
		driver.findElement(By.linkText("Selenium disulfide"));
		driver.findElement(By.linkText("Selenium dioxide")).click();
		driver.findElement(By.linkText("More »")).click();
		driver.findElement(By.xpath("//a[@href='https://en.wikipedia.org/wiki/Selenium']")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println(windowIDs);
		for (String winID : windowIDs) {
			String url = driver.switchTo().window(winID).getCurrentUrl();
			if (url.equals("https://en.wikipedia.org/wiki/Selenium_in_biology")) {
				System.out.println(driver.getTitle());
			} else if (url.equals("https://en.wikipedia.org/wiki/Selenium_dioxide")) {
				driver.close();
			}
		}

	}

}
