package inalidemail;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Invalid {

	private static WebDriver driver = null;
	private static final String URL = "https://facebook.com/";

	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Invalid.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		getDriver().get(URL);
	}
	@Test
	public void findEleme() {
		getDriver().findElement(By.name("firstname")).sendKeys("kisha");
		getDriver().findElement(By.name("lastname")).sendKeys("yalsdj");
		getDriver().findElement(By.name("reg_email__")).sendKeys("45454115165464655116454564634");
		getDriver().findElement(By.name("reg_email_confirmation__")).sendKeys("45454115165464655116454564634");
		getDriver().findElement(By.name("reg_passwd__")).sendKeys("5555551134");
		WebElement mySelectElement = getDriver().findElement(By.id("month"));
		WebElement mySelectElement1 = getDriver().findElement(By.id("day"));
		WebElement mySelectElement11 = getDriver().findElement(By.id("year"));
		Select dropdown = new Select(mySelectElement);
		Select dropdown1 = new Select(mySelectElement1);
		Select dropdown11 = new Select(mySelectElement11);
		dropdown.selectByVisibleText("Jan");
		dropdown1.selectByVisibleText("25");
		dropdown11.selectByVisibleText("2000");
		getDriver().findElement(By.id("u_0_i")).click();
		getDriver().findElement(By.xpath(".//*[@id='u_0_e']")).click();
		String actual_msg = getDriver().findElement(By.xpath(".//*[@class='_5633 _5634 _53ij' and text()='Please enter a valid mobile number or email address.']")).getText();
		String expect = "Please enter a valid mobile number or email address.";
		Assert.assertEquals(actual_msg, expect);
		// Assert.assertTrue(actual_msg.contains("Please enter a valid mobile
		// number or email address."));
		// System.out.println(" Test passed");
	}
}