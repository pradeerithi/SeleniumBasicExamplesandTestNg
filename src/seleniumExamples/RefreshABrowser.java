package seleniumExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshABrowser {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.google.com/");

		driver.navigate().to("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Rith");

		// Refresh command

		// driver.navigate().refresh();

		// driver.getCurrentUrl()

		// driver.get(driver.getCurrentUrl());

		// JavaScript Executor

		// JavascriptExecutor executor = (JavascriptExecutor) driver;

		// executor.executeScript("location.reload()");

		// executor.executeScript("history.go(0)");

		// Robot class

		// Robot robot = new Robot();
		//
		// robot.keyPress(KeyEvent.VK_F5);
		// robot.keyRelease(KeyEvent.VK_F5);
		//

		// Action class
		Actions actions = new Actions(driver);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();

		// driver.quit();
	}
}
