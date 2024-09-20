package testng3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	@AfterTest()
	void testLogout() {
		System.out.println("Logout");
	}

	@Test()
	void at() {
		System.out.println("at");
	}
}
