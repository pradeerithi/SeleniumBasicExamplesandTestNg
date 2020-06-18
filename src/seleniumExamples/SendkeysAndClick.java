package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysAndClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\Selenium\\\\SeleniumExamples\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		
		// sendkeys
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("Rithvik" + Keys.ENTER);

		Thread.sleep(1000);
		
		
	}

}
