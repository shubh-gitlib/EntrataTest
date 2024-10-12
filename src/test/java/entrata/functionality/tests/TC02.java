package entrata.functionality.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC02 extends BaseTest {
	@Test(description = "Property Manager Login", priority = 1, enabled = true)
	public void propertyManagerLoginTest() {

		entrataPages.homePage().goTo(prop.getProperty("entrataUrl"));
		entrataPages.topNavigationBar().clickOnSignInLink();
		String signInPageTitle = entrataPages.signInPage().getTitleOfTheSignInPage();

		entrataPages.signInPage().clickOnPropertyManagerLoginLink();
		String loginPageTitle = entrataPages.loginPage().getTitleOfTheLoginPage();

		entrataPages.loginPage().enterUserName("name");
		entrataPages.loginPage().enterPassword("pass");
		entrataPages.loginPage().clickOnSignInButton();
		Boolean isMessageDisplayedAfterIncorrectLoginAttempt = entrataPages.loginPage()
				.isMessageDisplayedAfterIncorrectLoginAttempt();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(signInPageTitle, "Entrata Sign In", "Sign In page title is not matched");
		softAssert.assertEquals(loginPageTitle, "Sso Login", "Login page title is not matched");
		softAssert.assertTrue(isMessageDisplayedAfterIncorrectLoginAttempt,
				"Status message for Incorrect credentials displayed");
		softAssert.assertAll();
	}
}
