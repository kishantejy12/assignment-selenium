package button;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Button {

	
	
	
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
		public void button(){
			// driver.findElement(By.id("u_0_i")).click();
		       boolean isSelected = driver.findElement(By.id("u_0_i")).isSelected();
		        if(isSelected == false) {
		            System.out.println("Button is not selected");
		        } else {
		        	  System.out.println("Button is selected");
		        }
		}
		
		
}
