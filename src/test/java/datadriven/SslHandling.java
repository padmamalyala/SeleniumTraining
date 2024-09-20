package datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SslHandling {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) {
		if (browser.equals("Edge")) {

			EdgeOptions ops = new EdgeOptions();
			// ops.setAcceptInsecureCerts(true); ssl handling
			ops.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });//removed cotrolled by autn s/w
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver(ops);
		}
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
	}

}
