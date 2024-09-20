package useri;

import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandles {
	public static String browser = "Edge";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		Set<String> windowIds = driver.getWindowHandles();
		/* fisr approach to switch windows */
		// List<String> wlist = new ArrayList(windowIds);
		// String pID = wlist.get(0);
		// String cID = wlist.get(1); // driver.switchTo().window(cID);
		// driver.switchTo().window(pID);
		System.out.println(driver.getCurrentUrl());
		/* 2nd approach to switch windows */
		for (String windid : windowIds) {
			String title = driver.switchTo().window(windid).getTitle();
			if (title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}

		}

	}
}
