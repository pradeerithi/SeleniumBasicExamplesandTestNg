package seleniumExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWaysToPerformGoogleSearch {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement searchbox = driver.findElement(By.name("q"));
//		searchbox.sendKeys("selenium"+Keys.ENTER);
		
		searchbox.sendKeys("madurai");
		
//		searchbox.sendKeys("madurai \n");

//		searchbox.submit();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
		
	}

}
