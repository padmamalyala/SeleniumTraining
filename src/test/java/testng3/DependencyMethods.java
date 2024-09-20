package testng3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	@Test(priority = 1)
	void testOpenApp() {
		// Assert.assertTrue(false); // failed, the dependent methods should be skipped
		Assert.assertTrue(true); // passed, the dependent methods should be executed
	}

	@Test(priority = 2, dependsOnMethods = { "testOpenApp" })
	void testLogin() {
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods = { "testOpenApp" })
	void testSearch() {
		Assert.assertTrue(true);
	}

	@Test(priority = 4, dependsOnMethods = { "testOpenApp" })
	void testAdv() {
		Assert.assertTrue(true);
	}

	@Test(priority = 5, dependsOnMethods = { "testOpenApp" })
	void testLogout() {
		Assert.assertTrue(true);
	}
}
