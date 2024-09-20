package listenerpack;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerpack.MyListener.class)// we dont use this one
public class TestCaseListenerTest {
	@Test(priority = 1)
	public void f() {
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	public void g() {
		Assert.assertTrue(false);
	}

	@Test(priority = 3, dependsOnMethods = { "g" })
	public void t() {
		Assert.assertTrue(true);
	}
}
