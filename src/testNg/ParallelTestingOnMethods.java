package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingOnMethods {

	@Test
	public void openBing() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\SeleniumExamples\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bing.com/");
		driver.quit();
	}

	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\SeleniumExamples\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}

}
