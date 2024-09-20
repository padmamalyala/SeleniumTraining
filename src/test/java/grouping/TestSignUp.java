package grouping;

import org.testng.annotations.Test;

public class TestSignUp {
	@Test(priority = 1, groups = { "regression" })
	void testSinUpEmail() {
		System.out.println("Sign up by eamial");
	}

	@Test(priority = 2, groups = { "regression" })
	void testSignUpFacebook() {
		System.out.println("Sign up by face book");
	}
}
