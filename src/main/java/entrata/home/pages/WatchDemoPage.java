package entrata.home.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import entrata.base.pages.BasePage;
import entrata.support.Log;

public class WatchDemoPage extends BasePage {

	// First Name text box
	private By txtFirstName = By.id("FirstName");

	// Last Name text box
	private By txtLastName = By.id("LastName");

	// Email text box
	private By txtEmail = By.id("Email");

	// Company Name text box
	private By txtCompanyName = By.id("Company");

	// Phone Number text box
	private By txtPhoneNumber = By.id("Phone");

	// Phone Job Title text box
	private By txtJobTitle = By.id("Title");

	// Unit Count drop-down
	private By ddlUnitCount = By.id("Unit_Count__c");

	// I am Owner/Resident drop down
	private By ddlIAm = By.id("demoRequest");
	
	// Watch Demo button
	private By btnWatchDemo = By.xpath("//button[@type= 'submit' and contains(text(), 'WATCH DEMO')]");

	public WatchDemoPage(final WebDriver driver) {
		super(driver);
	}

	// Enter First Name
	public void enterFirstName(String firstName) {
		Log.info("Entering First Name");

		type(txtFirstName, firstName);
	}

	// Enter Last Name
	public void enterLastName(String lastName) {
		Log.info("Entering Last Name");

		type(txtLastName, lastName);
	}

	// Enter Email
	public void enterEmail(String email) {
		Log.info("Entering Email");

		type(txtEmail, email);
	}

	// Enter Company Name
	public void enterCompanyName(String companyName) {
		Log.info("Entering Company Name");

		type(txtCompanyName, companyName);
	}

	// Enter Phone Number
	public void enterPhoneNumber(String phoneNumber) {
		Log.info("Entering Phone Number");

		type(txtPhoneNumber, phoneNumber);
	}

	// Enter Job Title
	public void enterJobTitle(String jobTitle) {
		Log.info("Entering Job Title");

		type(txtJobTitle, jobTitle);
	}

	// Select Unit Count
	public void selectUnitCount(String unitCount) {
		Log.info("Selecting Unit Count: " + unitCount);

		selectByVisibleText(ddlUnitCount, unitCount);
	}

	// Select I am Owner/Resident drop down
	public void selectIamOwnerOrResident(String name) {
		Log.info("Selecting I am Owner/Resident: " + name);

		selectByVisibleText(ddlIAm, name);
	}
	
	// is Watch Demo button visible
	public boolean isWatchDemoButtomVisible() {
		Log.info("Checking Whether Watch Demo button is visible");
		
		return isDisplayed(btnWatchDemo);
	}
}
