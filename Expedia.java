package dhtml1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Expedia extends Intilization {

	@Test
	public void TicketBooking() throws InterruptedException {

		driver.findElement(By.xpath(".//*[@class='tab-label' and text()='Flights']")).click();
		driver.findElement(By.id("flight-origin")).sendKeys("New york");
		List<WebElement> Departing = driver.findElements(By.className("results-item"));
		for (WebElement lis : Departing) {
			if (lis.getText().contains("LaGuardia")) {
				lis.click();
				break;
			}
		}
		driver.findElement(By.id("flight-destination")).sendKeys("las");
		List<WebElement> destination = driver.findElements(By.className("results-item"));
		for (WebElement lis2 : destination) {
			if (lis2.getText().contains("McCarran")) {
				lis2.click();
				break;
			}
		}
		driver.findElement(By.id("flight-departing-wrapper")).click();
		List<WebElement> date = driver
				.findElements(By.xpath(".//*[@id='package-departing-wrapper']/div/div/div[2]/table/tbody/tr/td"));
		for (WebElement Ddate : date) {
			if (Ddate.getText().equals("25")) {
				Ddate.click();
				break;
			}
		}
		List<WebElement> Return = driver
				.findElements(By.className(".//*[@id='flight-returning-wrapper']/div/div/div[2]/table/tbody/tr/td"));

		for (WebElement aa : Return) {
			if (aa.getText().equals("37")) {
				aa.click();
				break;
			}
		}
		WebElement n = driver.findElement(By.cssSelector("#flight-adults"));
		Select Adults = new Select(n);
		Adults.selectByVisibleText("3");
		Thread.sleep(2000);

		WebElement a = driver.findElement(By.cssSelector("#flight-children"));
		Select child = new Select(a);
		child.selectByVisibleText("1");
		Thread.sleep(2000);

		WebElement b = driver.findElement(By.cssSelector("#flight-age-select-1"));
		Select childage = new Select(b);
		childage.selectByVisibleText("10");
		Thread.sleep(2000);
		driver.findElement(By.id("search-button")).click();
	}

}
