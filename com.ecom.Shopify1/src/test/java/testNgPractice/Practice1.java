package testNgPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice1 {
	@Test
	public void test1()
	{
//		System.out.println("test1 executed");
//		Reporter.log("test1 executed");
		Reporter.log("test1 executed",true);
	}
	@Test
	public void test2()
	{
//		System.out.println("test2 executed");
		Reporter.log("test2 executed");
		
	}
	@Test
	public void test3()
	{
//		System.out.println("test2 executed");
		Reporter.log("test3 executed");
		
	}
	@Test
	public void test4()
	{
//		System.out.println("test2 executed");
		Reporter.log("test4 executed",true);
		
	}
}
