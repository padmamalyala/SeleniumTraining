package testng3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@BeforeTest()
	void testLogin() {
		System.out.println("Login");
	}

	@Test()
	void bt() {
		System.out.println("bt");
	}
}
