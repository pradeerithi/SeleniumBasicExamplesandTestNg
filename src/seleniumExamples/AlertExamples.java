package seleniumExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// to launch the url
		driver.get("http://www.leafground.com/pages/Alert.html");

		// Alert
		// types:: simple alert, COnfirm alert, prompt alert

		// simple Alert
		WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		simpleAlert.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		// confirm Alert
		WebElement confirmAlert = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirmAlert.click();

		alert.dismiss();

		WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		promptAlert.click();

		alert.sendKeys("mithran");

		alert.accept();

	}

}
