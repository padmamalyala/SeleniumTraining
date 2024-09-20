package datadriven;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnableExtensions {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("chrome")) {
			ChromeOptions ops = new ChromeOptions();
			File file = new File("C:\\Automation\\Files\\SelectorHub.crx");
			// To enable extension while runtime
			ops.addExtensions(file);
			ops.addArguments("--incognito");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(ops);
		}
		driver.get("http://textcompare.com/");

	}

}
