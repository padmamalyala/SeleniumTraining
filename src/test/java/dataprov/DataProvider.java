package dataprov;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {
	public static WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo//index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//h5[normalize-space()='My Account']")).isDisplayed();
		if (status == true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Register']")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

//indices = { 0, 1 }- picks 0 and 1sr row
	@org.testng.annotations.DataProvider(name = "dp", indices = { 0, 1 })
	Object[][] loginData() {
		Object data[][] = { { "abc@gamil.com", "test123" }, { "xyz@gamail.com", " test@123" },
				{ "pavanol1223@gmail.com", "test@123" }

		};
		return data;
	}
}
