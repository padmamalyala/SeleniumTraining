package useri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalMethods {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		// WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo
		// store']"));
		// System.out.println("Display status:" + logo.isDisplayed());
		// boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo
		// store']")).isDisplayed();
		// System.out.println("The display status:" + status);
		// boolean status = driver.findElement(By.cssSelector("input[id
		// =FirstName]")).isEnabled();
		// System.out.println("The status is:" + status);
		WebElement male_rd = driver.findElement(By.xpath("//input[@value ='M']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Before checking female");
		System.out.println("The status is:" + male_rd.isSelected());
		System.out.println("The status is:" + female_rd.isSelected());
		System.out.println("After checking Female");
		female_rd.click();
		System.out.println("The status is:" + male_rd.isSelected());
		System.out.println("The status is:" + female_rd.isSelected());

	}

}
