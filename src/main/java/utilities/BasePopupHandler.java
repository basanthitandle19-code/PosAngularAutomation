package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePopupHandler {

	WebDriver driver;
	WebDriverWait wait;

	public BasePopupHandler(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	//ACCEPT ALERT
	public void acceptAlert() {
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert text: " + alert.getText());
			alert.accept();
		} catch (Exception e) {
			System.out.println("No alert found");
		}
	}

	//DISMISS ALERT
	public void dismissAlert() {
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.dismiss();
		} catch (Exception e) {
			System.out.println("No alert found");
		}
	}

	// 📥 GET ALERT TEXT
	public String getAlertText() {
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			return alert.getText();
		} catch (Exception e) {
			return null;
		}
	}
}
