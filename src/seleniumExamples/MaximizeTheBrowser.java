package seleniumExamples;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeTheBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Drivers\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		// maximize the driver in selenium
		// driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		// using demension option

		// Dimension dimension = new Dimension(900, 900);
		//
		// driver.manage().window().setSize(dimension);
		//
		driver.quit();

	}

}
