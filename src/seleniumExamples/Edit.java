package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// to launch the url
		driver.get("http://www.leafground.com/pages/Edit.html");

		WebElement emailText = driver.findElement(By.id("email"));
		emailText.sendKeys("vino@gmail.com");
		
		WebElement appendText = driver.findElement(By.xpath("//input[@value=\"Append \"]"));
		appendText.sendKeys("Rithvik");
		
		WebElement getText = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		System.out.println(getText.getAttribute("value"));

		WebElement clearText = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clearText.clear();
		
		WebElement distabledTab = driver.findElement(By.xpath("//input[@disabled='true']"));
		if (distabledTab.isEnabled()) {
			System.out.println("textbox is Enabled");
		}else {
			System.out.println("textbox is disabled");
		}
		
		
	}

}
