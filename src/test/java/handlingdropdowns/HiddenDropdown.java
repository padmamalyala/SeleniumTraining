package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDropdown {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) throws InterruptedException {

		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[2]"))
				.click();
		WebElement role_check = mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Automaton Tester")));

		role_check.click();

	}

}
