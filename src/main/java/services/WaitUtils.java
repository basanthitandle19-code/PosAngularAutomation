package services;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class WaitUtils {

	public static void waitForSeconds(WebDriver drv, int secs) {
		try {
			WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(secs));
			wait.wait();
		} catch (Exception e) {

			return;  // timeout handled
		}
	} 
	public static boolean waitAndClick(WebDriver driver, By locator) {

		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(locator)
					);

			element.click();

			return true;   // success

		} catch (TimeoutException e) {

			System.out.println("Element not visible within time limit: " + locator);

			return false;  // timeout handled
		}
	}
}