package useri;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame1 {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://www.saucedemo.com/");
		// driver.get("https://www.selenium.dev/");
		/* text()-xpath */
		// driver.findElement(By.xpath("//a[text()='Register now!']")).click();
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Testing");
		/* absolute xpath */
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("Test");
		/* start-with */
		// driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("TestingX");
		/* contains function */
		// driver.findElement(By.xpath("//input[contains(@id,'user-na')]")).sendKeys("Testc");
		// driver.findElement(By.xpath("//input[@type='text' or @id =
		// 'user-name']")).sendKeys("Text OR");
		// driver.findElement(By.xpath("//input[@type='text' and @id =
		// 'user-name']")).sendKeys("Test And");
		/* child -axes method */
		// driver.findElement(By.xpath("//div[@class
		// ='form_group']//child::input[@id='password']")).sendKeys("123123");
		/* self - Axes method */
		// driver.findElement(By.xpath("//input[@id =
		// 'user-name']//self::input")).sendKeys("Self");
		/* parent- Axes method */
		// input[@id = 'user-name']//parent::div
		/* descendant */
		driver.findElement(By.xpath("//div[@class='form_group']//descendant::input[@id ='user-name']"))
				.sendKeys("TestD");
	}

}
