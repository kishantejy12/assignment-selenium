import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.util.Strings;

public class Duplicates {

	public static WebDriver driver = null;
	private static final String URL = "https://facebook.com/";

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver-v0.11.1-win64//geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);

	}

	@Test
	public void selectFromDropDown() throws Exception {

		Select dropdown = new Select(driver.findElement(By.id("month")));
		List<WebElement> allOptions = dropdown.getOptions();
		int count = 0;
		for (WebElement option : allOptions) {
			if (option.getText().equals(option.getText())) {
				count++;
			}
			if (count == 13)
				System.out.println("it has no duplicate values");
			else if(count !=13)
				System.out.println("it has dupliacte values");
		}
	}

}
