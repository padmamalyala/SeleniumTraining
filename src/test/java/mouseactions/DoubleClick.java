package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	public static String browser = "Edge";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		//Switching to frame
		driver.switchTo().frame("iframeResult");
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		box1.clear();
		box1.sendKeys("welcome");
		//double click
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();
		// Validation box2 should contain "welcome"
		String text = box2.getAttribute("value");
		if (text.equals("welcome")) {
			System.out.println("Text copied");
		} else {
			System.out.println("Text not copied");
		}

	}

}
