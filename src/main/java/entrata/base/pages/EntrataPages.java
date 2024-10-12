package entrata.base.pages;

import org.openqa.selenium.WebDriver;

import entrata.home.pages.AgendaBaseCampPage;
import entrata.home.pages.BaseCampPage;
import entrata.home.pages.BaseCampPersonalInformationPage;
import entrata.home.pages.HomePage;
import entrata.home.pages.LoginPage;
import entrata.home.pages.SignInPage;
import entrata.home.pages.TopNavigationBar;
import entrata.home.pages.WatchDemoPage;

public class EntrataPages {
	private WebDriver driver;

	private TopNavigationBar topNavigationBar;
	private WatchDemoPage watchDemoPage;
	private HomePage homePage;
	private SignInPage signInPage;
	private LoginPage loginPage;
	private BaseCampPage baseCampPage;
	private BaseCampPersonalInformationPage baseCampPersonalInformationPage;
	private AgendaBaseCampPage agendaBaseCampPage;

	public EntrataPages(final WebDriver driver) {
		this.driver = driver;
	}

	public HomePage homePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}

	public TopNavigationBar topNavigationBar() {
		if (topNavigationBar == null) {
			topNavigationBar = new TopNavigationBar(driver);
		}
		return topNavigationBar;
	}

	public WatchDemoPage watchDemoPage() {
		if (watchDemoPage == null) {
			watchDemoPage = new WatchDemoPage(driver);
		}
		return watchDemoPage;
	}

	public SignInPage signInPage() {
		if (signInPage == null) {
			signInPage = new SignInPage(driver);
		}
		return signInPage;
	}

	public LoginPage loginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}

	public BaseCampPage baseCampPage() {
		if (baseCampPage == null) {
			baseCampPage = new BaseCampPage(driver);
		}
		return baseCampPage;
	}

	public BaseCampPersonalInformationPage baseCampPersonalInformationPage() {
		if (baseCampPersonalInformationPage == null) {
			baseCampPersonalInformationPage = new BaseCampPersonalInformationPage(driver);
		}
		return baseCampPersonalInformationPage;
	}

	public AgendaBaseCampPage agendaBaseCampPage() {
		if (agendaBaseCampPage == null) {
			agendaBaseCampPage = new AgendaBaseCampPage(driver);
		}
		return agendaBaseCampPage;
	}
}
