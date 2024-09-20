package grouping;

import org.testng.annotations.Test;

public class TestPayment {
	@Test(priority = 1, groups = { "sanity", "regression", "functional" })
	void testPaymentRupees() {
		System.out.println("Payment Rupees");
	}

	@Test(priority = 2, groups = { "sanity", "regression", "functional" })
	void testPaymentDollars() {
		System.out.println("Payment dollars");
	}
}
