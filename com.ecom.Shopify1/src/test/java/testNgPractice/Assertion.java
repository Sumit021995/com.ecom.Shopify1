package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test()
	public void test1() {
//		int a=10,b=5;
//		Assert.assertEquals(a, b);
//		Assert.assertNotEquals(a, b);
//		
//		boolean x=true;
//		Assert.assertTrue(x);
//		Assert.assertFalse(x);
		
		String s = "Null";
		Assert.assertNull(s);
		
		
	}
	@Test(priority=1)
	public void test2() {
//		int a=10,b=5;
//		Assert.assertEquals(a, b);
//		Assert.assertNotEquals(a, b);
//		
//		boolean x=true;
//		Assert.assertTrue(x);
//		Assert.assertFalse(x);
		
		String s = null;
		Assert.assertNull(s);
		
		
	}
}
