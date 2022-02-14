package com.ojt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test(priority = 1, groups = "regression")
	public void tc1() {
		System.out.println("tc1");
		Assert.assertTrue(true);
	}

	@Test(priority = 2, groups = "regression")
	public void tc2() {
		System.out.println("tc2");
		Assert.assertTrue(false);
	}

	@Test(priority = 3, groups = "regression")
	public void tc5() {
		System.out.println("tc5");
		Assert.assertTrue(false);
	}

	@Test(priority =1 ,groups = "user", dependsOnGroups = "regression")
	public void tc3() {
		System.out.println("tc3");
		Assert.assertTrue(true);
	}

	@Test( groups = "abc", dependsOnMethods = "tc5")
	public void tc4() {
		System.out.println("tc4");
		Assert.assertTrue(true);
	}

}
