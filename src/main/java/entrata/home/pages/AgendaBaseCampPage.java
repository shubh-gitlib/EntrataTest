package entrata.home.pages;

import org.openqa.selenium.WebDriver;
import entrata.base.pages.BasePage;
import entrata.support.Log;

public class AgendaBaseCampPage extends BasePage {
	public AgendaBaseCampPage(final WebDriver driver) {
		super(driver);
	}

	// Get Title of the page
	public String geTitleOfThePage() {
		Log.info("Getting title of the page");

		waitForMillis(4000);
		return getTitle();
	}
}
