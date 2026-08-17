package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationMethods {
	
	WebDriver driver;
	String baseUrl = "https://www.ajio.com/";
	String baseBackUrl = "https://www.myntra.com/";
	String baseNavUrl = "https://www.flipkart.com/";
	
	@Test(priority=0)
	public void NavigateDemo() {
		driver = new ChromeDriver();
		driver.navigate().to(baseUrl);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
	}

	@Test(priority=1)
	public void NavigateBackDemo() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to(baseNavUrl);
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.quit();
	}
	
	
	@Test(priority=2)
	public void RefreshDemo() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().refresh();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.quit();

	}
	
	
	@Test(priority=3)
	public void NavigateForwardDemo() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to(baseNavUrl);
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.quit();

	}
}
