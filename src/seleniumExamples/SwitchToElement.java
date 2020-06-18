package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchToElement {
	
	static WebElement q;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		// WebElement searchbox = driver.findElement(By.name("q")); 
		
//		switch to element
//		driver.switchTo().activeElement().sendKeys("Madurai \n");
		
		PageFactory.initElements(driver, SwitchToElement.class);

		q.sendKeys("Rithvik \n");
		
		driver.quit();
	}
}
