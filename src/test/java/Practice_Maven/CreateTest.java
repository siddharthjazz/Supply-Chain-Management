package Practice_Maven;

import org.testng.annotations.Test;

public class CreateTest {
	@Test
	public void create()
	{
		System.out.println("Created successfully");
		
	}

	
	@Test(groups="smoke")
	public void Update() {
		System.out.println("updated successfully");
				
	}
	
}
