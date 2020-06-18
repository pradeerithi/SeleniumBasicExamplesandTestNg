package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExamples {

	WebDriver driver;
	long startTime;
	long endTime;

	// Aim: open Chrome and go to
	// 1. google.co.in 2. bing.com 3. yahoo.com and then close the browser

	@BeforeSuite
	public void launchBrowser() {

		// system current in milli second
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\SeleniumExamples\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {
		driver.get("https://www.google.com/");
	}

	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}
//
//	@Test
//	public void openYahoo() {
//		driver.get("https://www.yahoo.com/");
//	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
