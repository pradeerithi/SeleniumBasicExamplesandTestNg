package seleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumExamples\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// to launch the url
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropDown = driver.findElement(By.id("dropdown1"));

		Select select = new Select(dropDown);
		select.selectByIndex(2);
		Thread.sleep(1000);

		select.selectByValue("4");
		Thread.sleep(1000);

		select.selectByVisibleText("UFT/QTP");
		Thread.sleep(1000);

		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (WebElement allOptions : options) {
			String all = allOptions.getText();
			System.out.println(all);
		}

		dropDown.sendKeys("Selenium");

		WebElement multiDropdown = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));

		Select multiSelect = new Select(multiDropdown);
		boolean multiple = multiSelect.isMultiple();

		if (multiple == true) {
			multiSelect.selectByValue("1");
			multiSelect.selectByValue("2");
			multiSelect.selectByValue("3");
		}

		//to get all selected option
		
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		
		for (WebElement allSelectedOptions : selectedOptions) {
			System.out.println(allSelectedOptions.getText());
			
		}
		WebElement multioption = multiSelect.getFirstSelectedOption();
		System.out.println(multioption.getText());
	}

}
