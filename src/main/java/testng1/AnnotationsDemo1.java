package testng1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Login -prerequisite for every test method
 * Search
 * adv Search
 * Logout - When we need to log out after every test method
 */
public class AnnotationsDemo1 {
	@BeforeMethod()
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

	@AfterMethod()
	void testLogout() {
		System.out.println("Logout");
	}
}
