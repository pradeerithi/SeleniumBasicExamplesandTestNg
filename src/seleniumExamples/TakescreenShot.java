package seleniumExamples;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.w3c.dom.css.Rect;

public class TakescreenShot {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");

		driver.findElement(By.xpath("//*[text()='Alert Box']")).click();

//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//
//		File source = screenshot.getScreenshotAs(OutputType.FILE);
//
//		File destination = new File("D:\\screenshot.png");
//
//		FileUtils.copyFile(source, destination);
		
//		FileHandler.copy(source, destination);

		
		Robot robot = new Robot();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rectangle = new Rectangle(screenSize);
		
		BufferedImage createScreenCapture = robot.createScreenCapture(rectangle);
		
		File destination = new File("D:\\screenshot.png");
		
		ImageIO.write(createScreenCapture, "png", destination);
		
		
		driver.quit();
		
	

	}

}
