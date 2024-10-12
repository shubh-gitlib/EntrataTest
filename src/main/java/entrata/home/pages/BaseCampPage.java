package entrata.home.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import entrata.base.pages.BasePage;
import entrata.support.Log;

public class BaseCampPage extends BasePage {

	// Super Early Bird Register now link
	private By lnkSuperEarlyBirdRegisterNow = By
			.xpath("//div[contains(text(), 'Super Early Bird')]//parent::div//child::div//following-sibling::"
					+ "a[contains(text(), 'Register Now')]");

	public BaseCampPage(final WebDriver driver) {
		super(driver);
	}

	// Get Title of Base Camp page
	public String getTitleofThePage() {
		Log.info("Getting Title of the page");

		return getTitle();
	}

	// Click on Super Early Bird Register Now link
	public void clickOnSuperEarlyBirdRegisterNowLink() {
		Log.info("Clicking on Super Early Bird Register Now link");

		click(lnkSuperEarlyBirdRegisterNow);
	}
}
