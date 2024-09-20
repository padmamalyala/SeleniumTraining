package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseoverAction {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		WebElement deskts = driver
				.findElement(By.xpath("//a[@class='nav-link dropdown-toggle'][normalize-space()='Desktops']"));
		Thread.sleep(5000);
		WebElement mac = driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Mac (1)']"));
		Thread.sleep(5000);
		// Actions calss have all predefined methods of selenium
		Actions act = new Actions(driver);
		// Mousehover
		act.moveToElement(deskts).moveToElement(mac).click().build().perform();
	}
}
