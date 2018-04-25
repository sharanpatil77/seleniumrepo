package testNg;


import org.testng.annotations.Test;

public class Priority {

	@Test(priority=2)
	public static void FirstTest()
	{
	System.out.println("This is the Test Case number Two because of Priority #2");
	}
	 
	@Test(priority=3)
	public static void SecondTest()
	{
	System.out.println("This is the Test Case number One because of Priority #1");
	}
	 
	@Test(priority=4)
	public static void FinalTest()
	{
	System.out.println("This is the Final Test Case because there is no Priority");
	}
	
	@Test(priority=1)
	public static void createTest() {
		
		System.out.println("This is Test case creation");
		
		
	}
	
	
}
