package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get(
				"https://mdbootstrap.com/docs/standard/extended/dropdown-checkbox/#:~:text=Responsive%20Dropdown%20checkbox%20built%20with");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='accept_cookies_btn']")).click();
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();// -to select the dropdown
		// To select single option
		WebElement check = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Checkme3']")));
		check.click();
		// Capture all options and find out size
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//label"));
		System.out.println(options.size());
		// To print all the options
		/*
		 * for (WebElement op : options) { System.out.println(op.getText()); }
		 */
		// To select multiple options
		for (WebElement op : options) {
			String option = op.getText();
			if (option.equals("Check me")) {
				op.click();
			}
		}

	}

}
