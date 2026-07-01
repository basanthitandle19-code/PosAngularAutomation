/**
 * 
 */
package services;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesTransactions extends ABasePage {
	// WebDriver driver;
	public SalesTransactions(WebDriver driver) {
		super(driver);

		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	WebDriverWait wait;
	//	@FindBy(how = How.XPATH,using ="//div[contains(@class,'row bkgray')]//button[1]")
	//	private WebElement Alterations;
	//	
	//	@FindBy(how = How.XPATH,using = "//button[contains(text(),'Alterations High')]")
	//	private WebElement AlterHigh;

	//	@FindBy(how = How.XPATH,using = "//button[contains(text(),'Insignia')]")
	//private WebElement Insignia;
	//		@FindBy(how = How.ID,using = "btnSalesTransCheckOut")
	//		private WebElement Checkout;
	//		@FindBy(how= How.NAME, using = "lastName")
	//		private WebElement CustomerLookup;
	//		@FindBy(how= How.CLASS_NAME, using="btn btn-primary")
	//		private WebElement Search;
	//		@FindBy(how= How.CLASS_NAME, using="Alexander Smith")
	//		private WebElement Customer;
	//		@FindBy(how= How.ID, using="CC")
	//		private WebElement creditcard;

	public void ClickAlter() {
		//Alterations.click();
	/*	WaitUtils.waitForSeconds(driver, 2);
		WaitUtils.waitAndClick(
				driver,
				By.xpath("//div[contains(@class,'row bkgray')]//button[1]")
				);*/
		By alterations = By.xpath("//button[contains(text(),'Alterations High')]");
		WebElement alter = wait.until(ExpectedConditions.elementToBeClickable(alterations));
		alter.click();
	}
	public void High() {
		/*WaitUtils.waitForSeconds(driver, 2);
		WaitUtils.waitAndClick(
				driver,
				By.xpath("//button[contains(text(),'Alterations High')]")
				);*/
		//AlterHigh.click();
		By AlterationsHighVolume = By.xpath("//button[contains(text(),'Insignia')]");
		WebElement highVolume =wait.until(ExpectedConditions.elementToBeClickable(AlterationsHighVolume));
		highVolume.click();
		
	}
	public void Insew() {
		/*WaitUtils.waitForSeconds(driver, 2);
		WaitUtils.waitAndClick(
				driver,
				By.xpath("//button[contains(text(),'Insignia')]")
				);
		//Insignia.click();*/
		By insignia =By.xpath("//button[contains(text(),'Insignia')]");
		WebElement Insigniasewingon = wait.until(ExpectedConditions.elementToBeClickable(insignia));
		Insigniasewingon.click();
	}

	public void salescheck() {
		/*		WaitUtils.waitForSeconds(driver, 2);
		WaitUtils.waitAndClick(
				driver,
				By.id("btnSalesTransCheckOut")
				);*/
		By salescart = By.id("btnSalesTransCheckOut");
		WebElement Checkout = wait.until(ExpectedConditions.elementToBeClickable(salescart));
		Checkout.click();
	}
	/*public void customerlastname(String lname) {
		
		WaitUtils.waitForSeconds(driver, 2);
		/*WaitUtils.waitAndClick(driver,By.className("lastName"));
			/CustomerLookup.click();
		WebElement lastNameTextBox = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'lastName')]")));
		//By lastName = By.xpath("//input[contains(@class,'lastName')]");
		lastNameTextBox.sendKeys(lname);*/
	//	WaitUtils.waitAndClick(driver,By.xpath("//input[contains(@class,'lastName')]"));
	//	WebElement lastNameTextBox = wait.until(
	   //         ExpectedConditions.elementToBeClickable(
		//By.xpath("//input[contains(@class,'lastName')]")
	        //    )// );
	   /* lastNameTextBox.clear();
	    lastNameTextBox.sendKeys(lname);	}*/
		public void customerlastname(String lname) {
		    By lastName = By.xpath("//input[@name='lastName']");
		    WebElement lastNameTextBox = wait.until(
		            ExpectedConditions.elementToBeClickable(lastName)
		    );

		    lastNameTextBox.clear();
		    lastNameTextBox.sendKeys(lname);
		}
		public void clicksearch() {

		    By searchButton = By.xpath("//button[@data-testid='qa-button-search']");

		    WebElement search = wait.until(
		            ExpectedConditions.elementToBeClickable(searchButton)
		    );

		    search.click();
		}
		public void selectCustomer(String customerName) {

		    By customer = By.xpath(
		        "//button[.//div[contains(text(),'" + customerName + "')]]"
		    );

		    WebElement customerButton = wait.until(
		            ExpectedConditions.elementToBeClickable(customer)
		    );

		    customerButton.click();
		}
	public void paymentmethod() {
		By tender = By.id("CA");
				WebElement TenderButton = wait.until(
						ExpectedConditions.elementToBeClickable(tender)
				);
		TenderButton.click();
	}
	
	/*public void clickExactCash() {
By exactcash = By.xpath("//button[@data-testid='qa-button-onexactcash']");
	    WebElement exactCashButton = wait.until(
	        ExpectedConditions.elementToBeClickable(exactcash));
		    	  exactCashButton.click();
	}*/
	public String getTenderPageTitle() {

	    WebElement heading = wait.until(
	        ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//span[contains(text(),'Cash/Check Tender')]")
	        )
	    );

	    return heading.getText();
	}
	public void Approvebutton() {
		By approve = By.id("btnApprove");
		WebElement aprovebtn = wait.until(ExpectedConditions.elementToBeClickable(approve));
		aprovebtn.click();
	}
	
	public void clickSave() {

	    By saveButton = By.xpath("//button[@data-testid='qa-button-save']");

	    WebElement save = wait.until(
	            ExpectedConditions.elementToBeClickable(saveButton));

	    save.click();
	}
	
/*	public void selectReceiptNone() {

	    By noneButton = By.xpath("//button[@data-testid='qa-button-receiptoption-4']");

	    WebElement button = wait.until(
	            ExpectedConditions.elementToBeClickable(noneButton)
	    );

	    button.click();
	}*/
	
	public void clickNoneButton() {

	    WebElement noneButton = wait.until(
	            ExpectedConditions.presenceOfElementLocated(
	                    By.xpath("//button[@data-testid='qa-button-receiptoption-4']")
	            )
	    );

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("arguments[0].scrollIntoView(true);", noneButton);

	    js.executeScript("arguments[0].click();", noneButton);
	}
	public void enterPin(int pin) {

	    By pinInput = By.xpath("//input[@data-testid='qa-input-action']");

	    WebElement pinField = wait.until(
	            ExpectedConditions.elementToBeClickable(pinInput)
	    );

	    pinField.clear();
	    pinField.sendKeys(String.valueOf(pin));
	}
//	public void sale(String lastname) throws InterruptedException{
//		//WebDriverWait wait = new WebDriverWait(driver,10);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.elementToBeClickable(Alterations));
//		ClickAlter();
//		High();
//		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		Insew();
//		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		salescheck();
//		wait.until(ExpectedConditions.elementToBeClickable(CustomerLookup));
//		customerlastname(lastname);
//		clicksearch();
//		wait.until(ExpectedConditions.elementToBeClickable(Customer));
//		selectcustomer("asdf");
//		wait.until(ExpectedConditions.elementToBeClickable(creditcard));
//		paymentmethod();
//	}

}
