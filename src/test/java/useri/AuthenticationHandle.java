package useri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationHandle {
	public static WebDriver driver;
	public static String browser = "Edge";

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		// driver.get("http://the-internet.herokuapp.com/basic-auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic-auth");

	}

}
