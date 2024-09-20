package testng2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
	@Test(priority = 1)
	void testAssert() {
		System.out.println("TestNG1");
		Assert.assertEquals(1, 2);// failed
		System.out.println("TestNG2"); // not executed
	}

	@Test(priority = 2)
	void testSoftassert() {
		System.out.println("T1");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2); // Failed
		System.out.println("T2");// But here executed
	}
}
