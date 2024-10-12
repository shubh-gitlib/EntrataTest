package entrata.functionality.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 extends BaseTest {
	@Test(description = "User is filling watch demo form and checking if the button is present", priority = 1, enabled = true)
	public void fillTheWatchDemoFormTest() {

		entrataPages.homePage().goTo(prop.getProperty("entrataUrl"));
		entrataPages.topNavigationBar().clickOnWatchDemoLink();
		entrataPages.watchDemoPage().enterFirstName("First Name");
		entrataPages.watchDemoPage().enterLastName("Last Name");
		entrataPages.watchDemoPage().enterEmail("email@email.com");
		entrataPages.watchDemoPage().enterCompanyName("Company");
		entrataPages.watchDemoPage().enterPhoneNumber("5645789654");
		entrataPages.watchDemoPage().selectUnitCount("11 - 100");
		entrataPages.watchDemoPage().enterJobTitle("Job Title");
		entrataPages.watchDemoPage().selectIamOwnerOrResident("a Resident");

		Boolean isWatchDemoButtomVisible = entrataPages.watchDemoPage().isWatchDemoButtomVisible();

		Assert.assertTrue(isWatchDemoButtomVisible, "Watch Demo Button is not visible");
	}
}
