package testng2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations1 {
	@BeforeClass()
	void testLogin() {
		System.out.println("Login");
	}

	@Test(priority = 1)
	void testSearch() {
		System.out.println("search");
	}

	@Test(priority = 2)
	void testAdv() {
		System.out.println("Adv search");
	}

	@AfterClass()
	void testLogout() {
		System.out.println("Logout");
	}

}
