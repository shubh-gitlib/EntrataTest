package entrata.home.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import entrata.base.pages.BasePage;
import entrata.support.Log;

public class TopNavigationBar extends BasePage{
	
	// Products menu drop down
	private By ddProducts = By.xpath("//nav[@role= 'navigation']//self::div[contains(text(), 'Products')]");
	
	// Watch Demo Link
	private By lnkWatchDemo = By.xpath("//div[contains(text(), 'Watch Demo')]//parent::a");
	
	// Sign in Link
	private By lnkSignIn = By.xpath("//*[contains(text(), 'Sign In')]");
	
	public TopNavigationBar(final WebDriver driver) {
		super(driver);
	}

	public void openProductsMenu() {
		Log.info("Opening Products menu");
		
		moveToElement(ddProducts);
	}
	
	public void clickOnWatchDemoLink() {
		Log.info("Clicking on Watch Demo Link");
		
		click(lnkWatchDemo);
	}
	
	public void clickOnSignInLink() {
		Log.info("Clicking on Sign In Link");
		
		click(lnkSignIn);
	}
}
