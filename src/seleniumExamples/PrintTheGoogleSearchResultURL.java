package seleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintTheGoogleSearchResultURL {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Drivers\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("selenium \n");

		Thread.sleep(5000);

		// List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));

		// // print the all the url in the page
		// for (WebElement links : totalLinks) {
		//
		// String printUrl = links.getAttribute("href");
		//
		// System.out.println(printUrl);
		// }

		// to print only the main URL

		List<WebElement> mainURL = driver.findElements(By.xpath("//*[@id='search']//div[@class='TbwUpd NJjxre']//cite"));
		
		for (WebElement webElement : mainURL) {
			
			System.out.println(webElement.getText());
		}
		driver.quit();
	}

}
