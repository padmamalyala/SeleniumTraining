package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	public static String browser = "edge";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(source, target).build().perform();
	}

}
