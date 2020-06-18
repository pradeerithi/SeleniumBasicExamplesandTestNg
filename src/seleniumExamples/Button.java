package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// to launch the url
		driver.get("http://www.leafground.com/pages/Button.html");

		//to get position of xy coordinates
		WebElement getPosition = driver.findElement(By.id("position"));
		Point xypoint = getPosition.getLocation();
		
		
		//to get x location
		System.out.println(xypoint.getX());
		
		//to get y location
		System.out.println(xypoint.getY());
		
		//to get css value of colour
		WebElement colortext = driver.findElement(By.id("color"));
		System.out.println(colortext.getCssValue("background-color"));
		
		//to get size of height and width
		WebElement sizeText = driver.findElement(By.id("size"));
		Dimension size = sizeText.getSize();
		
		//to get height size
		int height = size.getHeight();
		System.out.println(height);
		
		// to get width size
		
		int width = size.getWidth();
		System.out.println(width);
		

	}

}
