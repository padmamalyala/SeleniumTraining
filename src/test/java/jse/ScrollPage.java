package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPage {
	public static WebDriver driver;
	public static String browser = "edge";

	public static void main(String[] args) {
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// Scrolling page by pixels
		// jse.executeScript("window.scrollBy(0,1500)", "");
		// Scroll up to element display
		WebElement pho = driver.findElement(By.xpath("//input[@id ='phone']"));
		jse.executeScript("arguments[0].scrollIntoView();", pho);
		// System.out.println(jse.executeScript("return window.pageYOffset;"));
		// Scroll up to end of the page
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(jse.executeScript("return window.pageYOffset;"));
	}

}
