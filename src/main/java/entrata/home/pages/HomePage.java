package entrata.home.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import entrata.base.pages.BasePage;
import entrata.support.Log;

public class HomePage extends BasePage {

	// Accept Cookies button
	private By btnAcceptCookies = By.xpath("//a[@id = 'cookie-accept' and contains(text(), 'Accept Cookies')]");
	
	// Register Now link
	private By lnkRegisterNow = By.xpath("//div[contains(text(), 'Register Now!')]//parent::a");

	public HomePage(final WebDriver driver) {
		super(driver);
	}

	// Navigate to an URL
	public void goTo(String url) {
		Log.info("Navigating to URL: " + url);

		navigateTo(url);
		waitForMillis(3000);
		click(btnAcceptCookies);
	}
	
	// Click on Register Now link
	public void clickOnRegisterNowLink() {
		Log.info("Clicking on Register Now link");
		
		click(lnkRegisterNow);
	}
}
