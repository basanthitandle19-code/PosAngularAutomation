package launchBrowserTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import services.LoginPage;
import services.SalesTransactions;

public class LaunchTest extends BaseTest {
	@Test
	public void loginFlow() {

	    LoginPage loginPage = new LoginPage(driver);

	    loginPage.enterExchange("0205");
	    loginPage.enterVendor("24305210");
	    loginPage.enterPin("1234");
	    loginPage.clickLogin();
	    loginPage.confirmcheck();

	    loginPage.ContinueButtonClick();

	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, "CPOSWeb");
	}

	@Test(dependsOnMethods = {"loginFlow"})
	public void Services() {

	    SalesTransactions salestransactions = new SalesTransactions(driver);

	    salestransactions.ClickAlter();
	    salestransactions.High();
	    salestransactions.Insew();
	    salestransactions.salescheck();
	    salestransactions.customerlastname("smith");
	    salestransactions.clicksearch();
	    salestransactions.selectCustomer("Alexander Smith");
	    salestransactions.paymentmethod();
	 // String Title = driver.getTitle();
	   // salestransactions.Approvebutton();
	        salestransactions.getTenderPageTitle();
	  //  salestransactions.clickExactCash();
	    salestransactions.Approvebutton();
	   salestransactions.clickSave();
	   salestransactions.clickNoneButton();
	  salestransactions.enterPin(1234);
	   
	}

/*@Test
	public void loginFlow() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterExchange("0205");
		loginPage.enterVendor("24305210");
		loginPage.enterPin("1234");
		loginPage.clickLogin();
		loginPage.confirmcheck();

		loginPage.ContinueButtonClick();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "CPOSWeb");
	}
	@Test
	public void Services() {
		SalesTransactions salestransactions =new SalesTransactions(driver);
		salestransactions.ClickAlter();
		salestransactions.High();
		salestransactions.Insew();
		salestransactions.salescheck();
		salestransactions.customerlastname("smith");
		salestransactions.clicksearch();
		salestransactions.selectCustomer("Alexander Smith");
		salestransactions.paymentmethod();
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "Sales Transaction");
	}*/
}

/*
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;


import Services.LoginPage;


public class launchtest extends BaseTest {

	public launchtest() {}

	//WebDriver driver;
	@Test
	public void LoginAn() throws InterruptedException {

		driver= new ChromeDriver();
		//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterExchange("0205");
		loginPage.enterVendor("24305210");
		Thread.sleep(3000);
		//loginPage.enterLocation("");
		loginPage.enterPin("1234");
		Thread.sleep(3000);		
	}


    @Test
    public void verifyValidLogin() {

        LoginPage loginPage =
                new LoginPage(driver);

		loginPage.enterExchange("0205");
		loginPage.enterVendor("24305210");
		Thread.sleep(3000);
		//loginPage.enterLocation("");
		loginPage.enterPin("1234");
		Thread.sleep(3000);		

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,
                "Dashboard");
    } 

}

 */