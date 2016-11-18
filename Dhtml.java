package dhtml1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dhtml extends Intilization{
	
	@Test
		public void products() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/a"));
		action.moveToElement(we).build().perform();
		WebElement we1 = driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/a"));
     	action.moveToElement(we1).build().perform();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/ul/li[6]/ul[2]/li[2]/a")).click();
     	driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[4]/a")).click();
     	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("kishantejy12@gmail.com");
     	driver.findElement(By.xpath(".//*[@id='license']")).sendKeys("kishantej");
     	driver.findElement(By.xpath(".//*[@class='btn-thin-blue']")).click();
     	String actualtext=driver.findElement(By.xpath(".//*[@class='submit-error m-bottom-30']")).getText();
		String expectedurl = "ERROR: Invalid e-mail or license number";
		Assert.assertEquals(actualtext, expectedurl);
        	
	}}