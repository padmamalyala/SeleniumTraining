package useri;

//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethods {
	public static String browser = "Edge";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Thread.sleep(5000);
		// driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		// Thread.sleep(5000);
		// driver.close();
		// driver.quit();
		/* Assignment */
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		// driver.close();

		driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		Thread.sleep(5000);
		driver.close();
		// driver.quit();
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		// String windowid = driver.getWindowHandle();
		// System.out.println("The browser ID is:" + windowid);
		// Set<String> windowids = driver.getWindowHandles();
		// System.out.println("The browserid's are:" + windowids);
		// boolean status =
		// driver.findElement(By.xpath("//img[@align='top']")).isDisplayed();
		// System.out.println("The status is:" + status);
		// WebElement logo = driver.findElement(By.xpath("//img[@align='top']"));
		// System.out.println("The status is "+logo.isDisplayed());
		// boolean status =
		// driver.findElement(By.cssSelector("input.wikipedia-search-input")).isEnabled();
		// System.out.println("The status is:" + status);
		// WebElement status = driver.findElement(By.cssSelector("input#sunday"));
		// System.out.println("The status is :" + status.isSelected());
		/* Afetr clicking on checkbox */
		// status.click();
		// System.out.println("The status is :" + status.isSelected());

	}

}
