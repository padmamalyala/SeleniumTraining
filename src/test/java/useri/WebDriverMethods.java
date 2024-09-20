package useri;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {
	public static WebDriver driver;
	public static String browser = "edge";

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		/* Get methods */
		/* get - to launch application */
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Thread.sleep(5000);
		/* getTitle- returns title of the page */
		// System.out.println(driver.getTitle());
		/* getCurrentUrl- returns URL of the page */
		System.out.println(driver.getCurrentUrl());
		/* getPageSource- It will show page source */
		// System.out.println(driver.getPageSource());
		/* getWindoeHandle- returns ID of the browser window */
		// String windowid = driver.getWindowHandle();
		// System.out.println("The browser ID is:"+windowid);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println("The window id's are:" + windowids);
		String windowid = driver.getWindowHandle();
		System.out.println("The browser ID is:" + windowid);

	}

}
