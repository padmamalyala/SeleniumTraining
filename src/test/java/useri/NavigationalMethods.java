package useri;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalMethods {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) throws MalformedURLException {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		URL myurl = new URL("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(myurl);
		driver.navigate().to("https://demo.nopcommerce.com/register");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
	}

}
