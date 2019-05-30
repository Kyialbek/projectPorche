package testng;

import org.testng.Assert;
//import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGpart1 {
	
	@Test (priority =2)

	public void test1() {
		System.out.println("It should run second");
		Assert.assertEquals(1, 1);
	}
	@Test (priority=3)
	public void test2() {
		System.out.println("It should work last");
		Assert.assertEquals(2, 2);
	}
	
	@Test  (priority =1)
	public void test3() {
		System.out.println("It should run first");
		Assert.assertEquals("D", "D");
	}

}
