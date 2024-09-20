package useri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
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
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		/* tagNmae and ID */
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("shirts");
		/* when tag name optional */
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("shirts");
		/* tagName and class */
		// driver.findElement(By.cssSelector("input.search-box-text//
		// ")).sendKeys("frocks");
		/* tagName and attribute */
		// driver.findElement(By.cssSelector("input[placeholder='Search
		// store']")).sendKeys("thisrts");
		// driver.findElement(By.cssSelector("input.search-box-text[type=\"text\"]")).sendKeys("tho");
		driver.get("https://demo.opencart.com/");
		// driver.findElement(By.cssSelector("")).sendKeys("mac"); //tag id
		// driver.findElement(By.cssSelector("input.form-control
		// ")).sendKeys("iphone");// tag and class
		// driver.findElement(By.cssSelector("input[name='search']")).sendKeys("Andriod");//
		// tag and attribute
		driver.findElement(By.cssSelector("input.form-control[type='text']")).sendKeys("phone");// tag class attribute
	}

}
