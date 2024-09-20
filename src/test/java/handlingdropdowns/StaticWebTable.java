package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// No of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No of rows:" + rows);
		// No of columns
		int columns = driver.findElements(By.xpath("//table[@name ='BookTable']//th")).size();
		System.out.println("The no of columns:" + columns);
		// to read data from specific row and column
		String someName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]")).getText();
		System.out.println(someName);
// To print data from table- all rows and column
		/*
		 * for (int r = 2; r <= rows; r++) // -rows { for (int c = 1; c <= columns; c++)
		 * { String value =
		 * driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td["
		 * + c + "]")) .getText(); System.out.print(value + "\t"); }
		 * System.out.println();
		 */
		// To print book name for specific Author
		for (int r = 2; r < rows; r++) {
			String name = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();

			if (name.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println(bookName);
			}
		}
	}

}
