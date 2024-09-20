package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement countyDropdown = driver.findElement(By.cssSelector("select.form-control[id='country']"));
		Select dropdown = new Select(countyDropdown);
		// dropdown.selectByValue("canada");
		// dropdown.selectByIndex(3);
		// dropdown.selectByVisibleText("Canada");
		// To capture all the options from the dropdown
		List<WebElement> options = dropdown.getOptions();
		System.out.println(options.size());
		// To print options
		/*
		 * for (int i = 0; i < options.size(); i++) {
		 * System.out.println(options.get(i).getText()); }
		 */
		// enhanced for loop
		for (WebElement drpdn : options) {
			System.out.println(drpdn.getText());
		}

	}

}
