package Practice_Maven;

import org.testng.annotations.Test;

public class regressionsample {
	@Test(groups="regression")
	public void update() {
		System.out.println("got updated");
	}
	
	@Test(groups="smoke")
		public void delete() {
			System.out.println("deleted successfully");
		
	}

}
