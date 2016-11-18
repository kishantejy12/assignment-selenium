package selection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selection {

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
	public void button() {
		//driver.findElement(By.id("u_0_i")).click();
		boolean isSelected = driver.findElement(By.id("u_0_i")).isSelected();
		if (isSelected == true) 
				driver.findElement(By.id("u_0_h")).click();
				boolean isSelected1 = driver.findElement(By.id("u_0_h")).isSelected();
				if (isSelected1 == true) 
					System.out.println(" BOTH BUTTONS SHOULD NOT BE  SELECTED");
					 else {
			System.out.println(" select male or female button ");
			}}}