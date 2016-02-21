package git_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Open_BrowserTest {
	
	WebDriver driver;
	@Test
	public void openBrowser()
	{
		driver =new FirefoxDriver();
		driver.get("http://www.bbc.com");
	}

}
