package services;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ABasePage {
	
	WebDriver driver;
	public ABasePage(WebDriver driver) {
		this.driver=driver;
	}

	
			//implicit wait
		public void WaitOnWebElement(By b) {
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//explicit wait
			new WebDriverWait(driver,Duration.ofSeconds(60))
				.until(ExpectedConditions.visibilityOfElementLocated(b));
	}

}
