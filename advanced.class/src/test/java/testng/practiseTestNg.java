package testng;

import org.testng.annotations.Test;

public class practiseTestNg {
	@Test (priority =10)
	public void test1() {
		System.out.println("It will be executed 10th");
		
	}
	@Test (priority =9)
	public void test2() {
		System.out.println("It will be executed 9th");
		
	}
	@Test (priority =8)
	public void test3() {
		System.out.println("It will be executed 8th");
		
	}
	@Test (priority =7)
	public void test4() {
		System.out.println("It will be executed 7th");
		
	}@Test (priority =6)
	public void test5() {
		System.out.println("It will be executed 6th");
		
	}@Test (priority =5)
	public void test6() {
		System.out.println("It will be executed 5th");
		
	}@Test (priority =4)
	public void test7() {
		System.out.println("It will be executed 4th");
		
	}@Test (priority =3)
	public void test8() {
		System.out.println("It will be executed 3th");
		
	}@Test (priority =2)
	public void test9() {
		System.out.println("It will be executed 2th");
		
	}
	int count =1;
	@Test(invocationCount =5)
	
	public void test10() {
		
		System.out.println("It will be executed "+count++);
		
	}

}
