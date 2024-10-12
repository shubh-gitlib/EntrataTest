package entrata.home.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import entrata.base.pages.BasePage;
import entrata.support.Log;

public class LoginPage extends BasePage {

	// User Name text box
	private By txtUserName = By.name("company_user[username]");

	// Password text box
	private By txtPassword = By.name("company_user[password]");
	
	// Sign In button
	private By btnSignIn = By.xpath("//*[contains(text(), 'Sign In')]");
	
	public LoginPage(final WebDriver driver) {
		super(driver);
	}

	// Get Title of the Login page
	public String getTitleOfTheLoginPage() {
		Log.info("Getting title of the Login page");

		return getTitle();
	}

	// Enter User Name
	public void enterUserName(String userName) {
		Log.info("Entering User Name: " + userName);

		type(txtUserName, userName);
	}

	// Enter Password
	public void enterPassword(String password) {
		Log.info("Entering Password: " + password);

		type(txtPassword, password);
	}
	
	// click on Sign In button
	public void clickOnSignInButton() {
		Log.info("Clicking on Sign In button");
		
		click(btnSignIn);
	}
	
	// Is Message displayed after incorrect Login attempt
	public boolean isMessageDisplayedAfterIncorrectLoginAttempt() {
		Log.info("Checking whether Message is displayed after incorrect Login attempt");
		
		By locator = By.xpath("//p[@id= 'statusMessage']");
		return isMessageDisplayed(locator);
	}
}
