package useri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://testautomationpractice.blogspot.com/");
		/* to select single check box */
		// driver.findElement(By.cssSelector("input#sunday")).click();
		/* 1. To slect multiple chcek boxes */
		List<WebElement> checkBoxes = driver
				.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		/* to selet multiple */
		/*
		 * for (int i = 0; i < checkBoxes.size(); i++) { checkBoxes.get(i).click(); }
		 */
		/*enhanced for loop*/
		for(WebElement check: checkBoxes) {
			check.click();
		}
		/* to select last 4 */
		/*
		 * for (int i = 3; i < checkBoxes.size(); i++) { checkBoxes.get(i).click(); }
		 */
		/* for first 3 */
		/*
		 * for (int i = 0; i < 3; i++) { checkBoxes.get(i).click(); }
		 */
		/* To uncheck the checked boxes */
		for (int i = 0; i < 3; i++) {
			checkBoxes.get(i).click();
		}
		Thread.sleep(5000);
		for (int i = 0; i < checkBoxes.size(); i++) {
			if (checkBoxes.get(i).isSelected()) {
				checkBoxes.get(i).click();
			}

		}
	}

}
