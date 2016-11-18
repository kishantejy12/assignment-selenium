package dhtml1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Dhtml1 extends Intilization{
	@Test
	public void text() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/a"));
		action.moveToElement(we).build().perform();
		WebElement we1 = driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/a"));
     	action.moveToElement(we1).build().perform();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/ul/li[6]/ul[2]/li[2]/a")).click();
		JavascriptExecutor aaa=(JavascriptExecutor)driver;
		aaa.executeScript("scroll(0, 100000);");
		List<WebElement> actualList= driver.findElements(By.className("footer-col__link"));
		List<WebElement> expectedList= driver.findElements(By.className("footer-col__link"));
		for(WebElement aa: actualList)
		{// System.out.println(aa.getText());
			String s = aa.getText();
			// System.out.println(s);
			for (WebElement e : expectedList) {
				String s1 = e.getText();
				if (s.equals(s1))
					System.out.println(s1 + " is verified");
				else
					Assert.assertFalse(false);
				// Assert.fail("false");
			}
		}
	}
}