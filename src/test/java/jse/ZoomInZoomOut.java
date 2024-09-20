package jse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomInZoomOut {
	public static WebDriver driver;
	public static String browser = "edge";

	public static void main(String[] args) {
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.body.style.zoom='80%'");
	}

}
