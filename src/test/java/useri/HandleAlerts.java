package useri;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {
	public static WebDriver driver;
	public static String browser = "edge";

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		/*
		 * normal- alert Thread.sleep(5000);
		 * driver.findElement(By.cssSelector("button[onclick='myFunctionAlert()']")).
		 * click(); Thread.sleep(5000); Alert myalert = driver.switchTo().alert();
		 * System.out.println(myalert.getText()); myalert.accept();
		 */
		/*
		 * Confirm-alert
		 * driver.findElement(By.cssSelector("button[onclick='myFunctionConfirm()']")).
		 * click(); Thread.sleep(5000); Alert myalert = driver.switchTo().alert();
		 * 
		 * myalert.accept(); myalert.dismiss();
		 */
		/*- prompt
		driver.findElement(By.cssSelector("button[onclick='myFunctionPrompt()']")).click();
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		myalert.sendKeys("Test");
		myalert.accept();*/
		/* we can handle alert by expilict wait */
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("button[onclick='myFunctionAlert()']")).click();
		Thread.sleep(5000);
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		myalert.accept();

	}
}
