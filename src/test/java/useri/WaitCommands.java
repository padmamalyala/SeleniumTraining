package useri;

import org.openqa.selenium.By;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitCommands {
	public static String browser = "Edge";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			/* implicit wait */
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		}

		/* explicit wait- declaration */
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/* use */
		WebElement username = mywait
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Aadmin");
		WebElement passw = mywait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		passw.sendKeys("Admin123");
		WebElement login_btn = mywait
			.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	login_btn.click();
	}

}
