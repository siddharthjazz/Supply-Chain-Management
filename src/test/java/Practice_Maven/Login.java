package Practice_Maven;

import org.testng.annotations.Test;

public class Login {
	@Test
	public void loginapplication() {
		String BROWSER=System.getProperty("chrome");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
