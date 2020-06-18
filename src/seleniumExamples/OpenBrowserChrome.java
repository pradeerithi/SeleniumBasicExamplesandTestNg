package seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// to launch the url
		driver.get("http://www.leafground.com/");

		// to get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// to get title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		// to maximize the window
		driver.manage().window().maximize();
		
		//to close the browser
		driver.quit();

	}

}
