package timestamp;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;
import com.steadystate.css.util.Output;

public class Timestamp {

	public static WebDriver driver = null;
	private static final String URL = "https://www.facebook.com/";

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);
	}

	public static void takeScreenshot() {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String timeStamp = new SimpleDateFormat("MM_dd_yyyy HH_mm_ss").format(Calendar.getInstance().getTime());
			FileUtils.copyFile(src, new File("C://Selenium//" + timeStamp + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public static void screnshotexample() {
		try {
			driver.findElement(By.id("pk")).sendKeys("kishan");

		} catch (Exception e) {
			takeScreenshot();
			e.printStackTrace();
			throw new NoSuchElementException("Specified elemnt is not found");
		}
	}
}