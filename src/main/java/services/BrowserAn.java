package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAn {

	public static void main(String[] args) {
			System.out.println("BrowserAn browserStartAn");
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.google.com");
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("http://192.168.0.191:8090/");
//			driver.manage().window().maximize();
		    //return driver;
			

	}

}
