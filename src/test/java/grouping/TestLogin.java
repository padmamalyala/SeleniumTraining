package grouping;

import org.testng.annotations.Test;

public class TestLogin {
	@Test(priority = 1, groups = { "sanity" })
	void testLoginEmail() {
		System.out.println("Login by email");
	}

	@Test(priority = 2, groups = { "sanity" })
	void testLoginFacebook() {
		System.out.println("Login by Facebook");
	}
}
