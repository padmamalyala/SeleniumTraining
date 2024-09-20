package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTestTest {
	public static WebDriver driver;

	@Test(priority = 1)
	void openApp() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 2)
	void testLogo() {
		boolean logo = driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1721393199309']"))
				.isDisplayed();
		System.out.println("Logo displaying" + " " + logo);
	}

	@Test(priority = 3)
	void testLogin() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("Login success");
	}

	@Test(priority = 4)
	void closeApp() {
		driver.quit();

	}
}
