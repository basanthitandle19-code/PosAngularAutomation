package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utilities.BasePopupHandler;

public class BaseTest {

    protected WebDriver driver;
    protected BasePopupHandler popup;

  //  @BeforeMethod
 @BeforeClass
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://tandlelenovopc:8090/");
        
        //popup = new BasePopupHandler(driver);

        // handle any unexpected alert globally
        //popup.acceptAlert();
    }
           @AfterClass
    //@AfterMethod
    public void tearDown() {

  //      if(driver != null) {
         //  driver.close();
         //  }
    }
}
