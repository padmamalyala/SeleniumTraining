package testng;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test(priority = 1)
	void openApp() {
		System.out.println("Open application");
	}

	@Test(priority = 2)
	void loginApp() {
		System.out.println("Login to Application");
	}

	@Test(priority = 3)
	void closeApp() {
		System.out.println("Close Application");
	}
}
