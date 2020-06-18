package seleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickTheGoogleSuggestion {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("selenium");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for (WebElement suggestionList : list) {
			
				String text = suggestionList.getText();
			
				System.out.println(text);
				
				if(text.contains("testing")){
					suggestionList.click();
					break;
				}

		}

		driver.quit();
	}

}


//using position to click the suggestion

//int position = 0;
//
//for (WebElement suggestionList : list) {
//
//	String text = suggestionList.getText();
//
//	System.out.println(text);
//
//	position++;
//
//	if (position == 3) {
//		suggestionList.click();
//		break;
//	}
