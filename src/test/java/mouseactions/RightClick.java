package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static WebDriver driver;
	public static String browser = "edge";

	public static void main(String[] args) {
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		// Right click
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(button).build().perform();
		// clicking on copy
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		// closing alert pop up
		driver.switchTo().alert().accept();
	}

}
