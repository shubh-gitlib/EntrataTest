package entrata.home.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import entrata.base.pages.BasePage;
import entrata.support.Log;

public class BaseCampPersonalInformationPage extends BasePage {

	// First name text box
	private By txtFirstName = By.xpath("//input[@aria-label= 'First name']");

	// Last name text box
	private By txtLastName = By.xpath("//input[@aria-label= 'Last name']");

	// Company text box
	private By txtCompany = By.xpath("//input[@aria-label= 'Company']");

	// Title text box
	private By txtTitle = By.xpath("//input[@aria-label= 'Title']");

	// Email Address text box
	private By txtEmailAddress = By.xpath("//input[@aria-label= 'Email Address']");

	// Mobile text box
	private By txtMobile = By.xpath("//input[@aria-label= 'Mobile']");

	// Address 1 text box
	private By txtAddress1 = By.xpath("//input[@aria-label= 'Address 1']");

	// Address 2 text box
	private By txtAddress2 = By.xpath("//input[@aria-label= 'Address 2']");

	// City text box
	private By txtCity = By.xpath("//input[@aria-label= 'City']");

	// ZIP/Postal Code text box
	private By txtZIPCode = By.xpath("//input[@aria-label= 'ZIP/Postal Code']");

	// County/Region drop down
	private By ddlCountryRegion = By.xpath(
			"//span[contains(text(), 'Country/Region')]//ancestor::label//following-sibling::div//*[local-name() = 'svg']");

	// State/Province drop down
	private By ddlStateProvince = By.xpath(
			"//span[contains(text(), 'State/Province')]//ancestor::label//following-sibling::div//*[local-name() = 'svg']");

	// cancel button
	private By btnCancel = By.id("exit");

	public BaseCampPersonalInformationPage(final WebDriver driver) {
		super(driver);
	}

	// Get Title of the page
	public String geTitleOfThePage() {
		Log.info("Getting title of the page");

		waitUntilPageIsLoaded();
		return getTitle();
	}

	// Enter First name
	public void enterFirstName(String firstName) {
		Log.info("Entering First Name: " + firstName);

		type(txtFirstName, firstName);
	}

	// Enter Last name
	public void enterLastName(String lastName) {
		Log.info("Entering Last Name: " + lastName);

		type(txtLastName, lastName);
	}

	// Enter Company name
	public void enterCompany(String company) {
		Log.info("Entering Company: " + company);

		type(txtCompany, company);
	}

	// Enter Title
	public void enterTitle(String title) {
		Log.info("Entering Title: " + title);

		type(txtTitle, title);
	}

	// Enter Email Address
	public void enterEmailAddress(String emailAddress) {
		Log.info("Entering Email Address: " + emailAddress);

		type(txtEmailAddress, emailAddress);
	}

	// Enter Mobile
	public void enterMobileName(String mobile) {
		Log.info("Entering Mobile: " + mobile);

		type(txtMobile, mobile);
	}

	// Enter Address 1
	public void enterAddress1(String address1) {
		Log.info("Entering Address 1: " + address1);

		type(txtAddress1, address1);
	}

	// Enter Address 2
	public void enterAddress2(String address2) {
		Log.info("Entering Address 2: " + address2);

		type(txtAddress2, address2);
	}

	// Enter City
	public void enterCity(String city) {
		Log.info("Entering City: " + city);

		type(txtCity, city);
	}

	// Enter Zip/Postal code
	public void enterZipPotalCode(String zipCode) {
		Log.info("Entering Zip/Potal Code: " + zipCode);

		type(txtZIPCode, zipCode);
	}

	// get Country name
	public void getCountryName(String countryName) {

		List<WebElement> countryList = findElements(By.xpath("//div[@role= 'listbox']//child::div[@role= 'option']"));
		for (int i = 0; i < countryList.size(); i++) {
			if (countryList.get(i).getText().equalsIgnoreCase("countryName")) {
				countryList.get(i).click();
				break;
			}
		}
	}

	// Select Country/Region
	public void selectCountry(String country, String countryName) {
		Log.info("Selecting Country");

		click(ddlCountryRegion);

		By locator = By.xpath("//input[starts-with(@id, 'countryCode')]");
		type(locator, country);

		waitForMillis(3000);
		By l1 = By.xpath("//div[@role= 'listbox']//child::div[@role= 'option' and contains(text(), '" + countryName
				+ "') " + "and not (contains(text(), 'Indian'))]");
		mouseoverAndClick(l1);
	}

	// Select State/Province
	public void selectState(String state, String stateName) {
		Log.info("Selecting State");

		click(ddlStateProvince);

		By locator = By.xpath("//input[starts-with(@id, 'stateCode')]");
		type(locator, state);

		waitForMillis(3000);
		By l1 = By.xpath(
				"//div[@role= 'listbox']//child::div[@role= 'option' and contains(text(), '" + stateName + "')]");
		mouseoverAndClick(l1);
	}

	// Click on Cancle button
	public void clickOnCancelButton() {
		Log.info("Clicking on Cancel button");

		click(btnCancel);
	}
}
