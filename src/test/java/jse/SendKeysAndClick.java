package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysAndClick {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement inbox = driver.findElement(By.xpath("//input[@id='female']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].setAttribute('value','Padma')", inbox);
		js.executeScript("arguments[0].click()", inbox);
	}

}
