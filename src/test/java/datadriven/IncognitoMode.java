package datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoMode {
	public static WebDriver driver;
	public static String browser = "chrome";

	public static void main(String[] args) {
		if (browser.equals("chrome")) {

			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--incognito");
			WebDriverManager.edgedriver().setup();

			driver = new ChromeDriver(ops);
		}
		driver.get("https://testautomationpractice.blogspot.com/");
	}

}
