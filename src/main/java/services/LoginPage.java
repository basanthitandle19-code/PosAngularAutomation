package services;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends ABasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "exchangenumber")
	private WebElement exchange;

	@FindBy(how = How.ID, using = "vendornumber")
	private WebElement vendor;

	@FindBy(how = How.ID, using = "ddLocation")
	private WebElement location;

	@FindBy(how = How.ID, using = "pin")
	private WebElement pin;

	@FindBy(how = How.ID, using = "btnSubmit")
	private WebElement loginBtn;

	//  @FindBy(how = How.XPATH, using ="//input[@id='confirmPrivacyAct']")
//	@FindBy(how = How.ID, using ="confirmPrivacyAct")
	//private WebElement Confirm; 
	// -------- Actions --------
	@FindBy(how = How.XPATH, using= "//button[@class='btn btn-success btn-lg px-5']")
	private WebElement Continue ; 
	public void enterExchange(String value) {
		exchange.clear();
		exchange.sendKeys(value);
	}

	public void enterVendor(String value) {
		vendor.clear();
		vendor.sendKeys(value);
	}

	public void enterLocation(String value) {
		location.sendKeys(value);
	}

	public void enterPin(String value) {
		try {

			pin.clear();
			pin.sendKeys(value);
		}
		catch(Exception ex) {}
	}

	public void clickLogin() {
		System.out.println("inside clickLogin method");
		loginBtn.click();
	}
	public void confirmcheck() {
		boolean clicked = WaitUtils.waitAndClick(
				driver,
				By.xpath("//input[@id='confirmPrivacyAct']"));

		System.out.println("Clicked: " + clicked);
		//Confirm.click();

	}
	
	public void ContinueButtonClick() {
		
		boolean clicked = WaitUtils.waitAndClick(
		    driver,
		    By.xpath("//button[@class='btn btn-success btn-lg px-5']"));
		
		//id("//button[@class='btn btn-success btn-lg px-5']"))

	}

	// -------- BUSINESS METHOD (BEST PRACTICE) --------

//	public void login(String exchangeVal, String vendorVal, String pinVal) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		//WebDriverWait wait = new WebDriverWait(driver,60);
//		enterExchange(exchangeVal);
//		enterVendor(vendorVal);
//		enterPin(pinVal);
//		clickLogin();
//
//		wait.until(ExpectedConditions.elementToBeClickable(Confirm));
//		confirmcheck();
//		//Thread.sleep(2000);
//		ContinueButtonClick();
//	}


	//*Public void EnterAngCredentials(String EXNum,String VenNum,String location,String pin) throws InterruptedException {
	//WebDriverWait wait = new WebDriverWait(driver,60);
	//	wait.until(ExpectedConditions.elementToBeClickable(EXCHANGE));
	//	EXCHANGE.click();
	//	System.out.println(EXNum);
	//	System.out.println(VenNum);
	//System.out.println(location);
	//System.out.println(pin);
	//EXCHANGE.sendkeys(EXNum);
	//VENDOR.sendkeys(VenNum);
	//	LOCATION.sendkeys(location);
	//	PIN.sendkeys(pin);
	//LOGON.click();


	//}

}