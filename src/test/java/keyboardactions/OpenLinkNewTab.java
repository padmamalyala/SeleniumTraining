package keyboardactions;

import java.time.Duration;

//import java.util.ArrayList;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkNewTab {
	public static WebDriver driver;
	public static String browser = "edge";

	public static void main(String[] args) {
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		// Openig new tab
		WebElement reg_Link = driver.findElement(By.xpath("//a[@class='ico-register']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(reg_Link).keyUp(Keys.CONTROL).perform();
		// Switching to window
	//	List<String> ids = new ArrayList(driver.getWindowHandles());
		//driver.switchTo().window(ids.get(1));

	}

}
