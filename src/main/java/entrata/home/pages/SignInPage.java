package entrata.home.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import entrata.base.pages.BasePage;
import entrata.support.Log;

public class SignInPage extends BasePage{
	
	// Property Manager Login link
	private By lnkPropertyManagerLogin = By.xpath("//div[contains(text(), 'Property Manager Login')]//parent::a");
	
	public SignInPage(final WebDriver driver) {
		super(driver);
	}
	
	// Get Title of the Sign In page
	public String getTitleOfTheSignInPage() {
		Log.info("Getting title of the Sign In page");
		
		return getTitle();
	}
	
	// click on Property Manager Login link
	public void clickOnPropertyManagerLoginLink() {
		Log.info("Clicking on Property Manager Login link");
		
		click(lnkPropertyManagerLogin);
	}
	
}
