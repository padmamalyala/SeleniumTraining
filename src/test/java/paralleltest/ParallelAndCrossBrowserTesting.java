package paralleltest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelAndCrossBrowserTesting {
	public static WebDriver driver;

	@BeforeClass
	@Parameters({ "browser" })
	void setUp(String br) throws InterruptedException {
		switch (br) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid");
			return; // Completely exit from test--if test fails
		}
		// driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}

	@Test
	void testLogin() {
		System.out.println("CjeckS");
	}

	@AfterClass()
	void tearDown() {
		driver.quit();
	}

}
