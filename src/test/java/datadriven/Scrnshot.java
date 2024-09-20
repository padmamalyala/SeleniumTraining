package datadriven;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrnshot {
	public static WebDriver driver;
	public static String browser = "edge";

	public static void main(String[] args) {

		if (browser.equals("edge")) {
			// Headless testing
			EdgeOptions ops = new EdgeOptions();
			ops.addArguments("--headless=new");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(ops);
		}
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// Takes full pge ss
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File sourcefile =
		 * ts.getScreenshotAs(OutputType.FILE); File targetfile = new
		 * File(System.getProperty("user.dir") + "\\screenshots\\fullss.png");
		 * sourcefile.renameTo(targetfile);
		 */
		// Taking specific ss
		/*
		 * WebElement ss1 =
		 * driver.findElement(By.xpath("//div[4][@class='form-group']")); File
		 * sourcefile = ss1.getScreenshotAs(OutputType.FILE); File targetfile = new
		 * File(System.getProperty("user.dir") + "\\\\screenshots\\\\specificss.png");
		 * sourcefile.renameTo(targetfile);
		 */
		// Takin webelement ss
		WebElement ss2 = driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		File srcfile = ss2.getScreenshotAs(OutputType.FILE);
		File trgfile = new File(System.getProperty("user.dir") + "\\screenshots\\WebElement.png");
		srcfile.renameTo(trgfile);
		System.out.println("headless");
	}

}
