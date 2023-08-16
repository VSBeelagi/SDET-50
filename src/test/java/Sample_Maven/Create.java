package Sample_Maven;

import org.testng.annotations.Test;

public class Create {

	@Test(groups = "smoke")
	public void createTest()
	{
		System.out.println("-- Create data --");
	}
	
	@Test(groups = "regressionTest")
	public void ModifyTest()
	{
		System.out.println("-- Modify data --");
	}
}
