package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestingOnTest {

	WebDriver driver = null;

	@Test
	@Parameters({ "browser" })
	public void openBrowser(String name) {
		if (name.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\SeleniumExamples\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (name.equals("name")) {
			System.setProperty("webdriver.gecko.driver", 
					"E:\\Selenium\\SeleniumExamples\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				
		}else {
			System.out.println("Invalid selection....");
		}
		driver.get("https://www.google.com/");
//		driver.quit();

	}
}
