package calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) throws InterruptedException {

		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		// -Using sendKeys-Date entering
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/11/2024");
		// Using Date picker
		String year = "2025";
		String month = "June";
		String day = "15";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		// -To capture year and month;
		while (true) {
			String currentYear = driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();
			String currentMonth = driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// next

			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click();// previous
		}
		// to capture-days
		List<WebElement> allDay = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : allDay) {
			if (dt.getText().equals(day)) {
				dt.click();
				break;
			}
		}
	}
}
