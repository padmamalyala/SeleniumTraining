package keyboardactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		/*
		 * WebElement min_slider = driver.findElement( By.
		 * xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][@style='left: 0%;']"
		 * )); System.out.println("The position of slider is:" +
		 * min_slider.getLocation()); // moving slider right side Actions act = new
		 * Actions(driver); act.dragAndDropBy(min_slider, 100, 251).perform();
		 * System.out.println(" The position of slider now" + min_slider.getLocation());
		 */
		// Moving slider to right side (reducing)
		Actions act = new Actions(driver);
		WebElement max_silder = driver.findElement(
				By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][@style='left: 100%;']"));
		System.out.println("The slider position:" + max_silder.getLocation());
		act.dragAndDropBy(max_silder, -100, 251).perform();
		System.out.println("The slider position now:" + max_silder.getLocation());

	}

}
