package useri;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame2 {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		// driver.get("https://saucedemo.com/");
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		/* Elemetnts By class Name */
		List<WebElement> links = driver.findElements(By.className("nav-item"));
		System.out.println("The number of links are:" + links.size());
		/* Img by tag name */
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("The number of images are:" + images.size());
		driver.findElement(By.xpath("//h4[@class='card-title']//child::a[1]")).click();
		/* To handle NoSuchElementException- Switch to frame/iframe */
		driver.switchTo().defaultContent();

		/* css selector */
		// driver.findElement(By.cssSelector("input[type='text']")).sendKeys("problem_user");
		/* css selector by ID attribute */
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		/* cssSelector BY class attribute */
		// driver.findElement(By.cssSelector("input.submit-button ")).click();
		/* css Selector with multiple attributes like placeholde .... */
		// driver.findElement(By.cssSelector("input[value='Login']")).click();
		/* Advanced CSs */
		/* class */
		// driver.findElement(By.cssSelector("input.submit-button[value ='Login'][type
		// ='submit']")).click();
		/* id */
		// driver.findElement(By.cssSelector("input#login-button[value ='Login'][type
		// ='submit']")).click();

		/* css sub-string matches */
		/* When prefix static */

		// driver.findElement(By.cssSelector("input[name^='login-button_1234']")).click();
		/* When suffix is static */
		// driver.findElement(By.cssSelector("input[name$='login-button']")).click();
		/* When middle of the text/string is static */
		// driver.findElement(By.cssSelector("input[name*='login-button']")).click();

	}

}
