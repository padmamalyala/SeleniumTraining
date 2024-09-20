package keyboardactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {
	public static String browser = "Edge";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://textcompare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@name ='frm_compare_1']")).sendKeys("Padma Malyala");
		Actions act = new Actions(driver);
		// ctrl + A -- selecting text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		// ctrl+c-- copying text.
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		// tab - switch to 2nd box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		// ctrl+v- Pasting text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
