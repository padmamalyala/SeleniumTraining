package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotation2 {
	@BeforeClass()
	void testLogin() {
		System.out.println("Login");
	}

	@Test(priority = 1)
	void testSearch() {
		System.out.println("Search");
	}

	@Test(priority = 2)
	void testAdvsearch() {
		System.out.println("Adv Search");
	}

	@AfterClass()
	void testLogout() {
		System.out.println("Logout");
	}

}
