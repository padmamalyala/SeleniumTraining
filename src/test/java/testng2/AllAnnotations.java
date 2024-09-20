package testng2;

import org.testng.annotations.*;

public class AllAnnotations {
	@BeforeSuite
	void bs() {
		System.out.println("Before suite");
	}

	@AfterSuite
	void as() {
		System.out.println("After suite");
	}

	@BeforeTest
	void bt() {
		System.out.println("Before test");
	}

	@AfterTest
	void at() {
		System.out.println("after test");
	}

	@BeforeClass
	void bc() {
		System.out.println("Before class");
	}

	@AfterClass
	void ac() {
		System.out.println("After calss");
	}

	@BeforeMethod
	void bm() {
		System.out.println("Before method");
	}

	@AfterMethod
	void am() {
		System.out.println("after method");
	}

	@Test(priority = 1)
	void test1() {
		System.out.println("test1");
	}

	@Test(priority = 2)
	void test2() {
		System.out.println("test2");
	}
}
