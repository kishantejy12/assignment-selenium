import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Datapolicy {

	public static WebDriver driver = null;
	private static final String URL = "https://www.facebook.com/";

	public static void switchToWindow(int index) {
		List<String> ListOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ListOfWindows.get(index));
	}

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@Test
	public void Dtapolicy()
	{
		driver.findElement(By.cssSelector("#privacy-link")).click();
		switchToWindow(1);
		driver.findElement(By.xpath(".//*[@class='_1tv_' and text()=' What kinds of information do we collect? ']")).click();
		
		String a1=driver.findElement(By.xpath(".//*[@class='_1z2h' and text()='Things you do and information you provide.']")).getText();
		String expected ="Things you do and information you provide.";
		Assert.assertEquals(a1, expected);
		String a2=driver.findElement(By.xpath(".//*[@class='_1z2h' and text()='Things others do and information they provide.']")).getText();
	String expected1 ="Things others do and information they provide.";
	Assert.assertEquals(a2, expected1);
	String a3=driver.findElement(By.xpath(".//*[@class='_1z2h' and text()='Your networks and connections.']")).getText();
	String expected3 ="Your networks and connections.";
	Assert.assertEquals(a3, expected3);
	String a4=driver.findElement(By.xpath(".//*[@class='_1z2h' and text()='Information about payments.']")).getText();
	String expected4 ="Information about payments.";
	Assert.assertEquals(a4, expected4);
	String a5=driver.findElement(By.xpath(".//*[@class='_1z2h' and text()='Device information.']")).getText();
	String expected5 ="Device information.";
	Assert.assertEquals(a5, expected5);
	String a6=driver.findElement(By.xpath(".//*[@class='_1z2h' and text()='Information from websites and apps that use our Services.']")).getText();
	String expected6 ="Information from websites and apps that use our Services.";
	Assert.assertEquals(a6, expected6);
	String a7=driver.findElement(By.xpath(".//*[@class='_1z2h' and text()='Information from third-party partners.']")).getText();
	String expected7 ="Information from third-party partners.";
	Assert.assertEquals(a7, expected7);
	
	
	
	
	
	}
}