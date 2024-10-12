package entrata.functionality.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import entrata.base.pages.BasePage;

public class TC03 extends BaseTest {
	@Test(description = "Register as Super early bird for Base Camp", priority = 1, enabled = true)
	public void superEarlyBirdBaseCampRegistrationTest() {

		entrataPages.homePage().goTo(prop.getProperty("entrataUrl"));
		entrataPages.homePage().clickOnRegisterNowLink();
		String baseCampPageTitle = entrataPages.baseCampPage().getTitleofThePage();

		entrataPages.baseCampPage().clickOnSuperEarlyBirdRegisterNowLink();
		String baseCampPersonalInformationPageTitle = entrataPages.baseCampPersonalInformationPage().geTitleOfThePage();

		entrataPages.baseCampPersonalInformationPage().enterFirstName(BasePage.getRandomStringOfLength(6));
		entrataPages.baseCampPersonalInformationPage().enterLastName(BasePage.getRandomStringOfLength(6));
		entrataPages.baseCampPersonalInformationPage().enterCompany(BasePage.getRandomStringOfLength(6));
		entrataPages.baseCampPersonalInformationPage().enterTitle(BasePage.getRandomStringOfLength(6));
		entrataPages.baseCampPersonalInformationPage()
				.enterEmailAddress(BasePage.getRandomStringOfLength(6) + "@email.com");
		entrataPages.baseCampPersonalInformationPage().enterMobileName("+919617818817");
		entrataPages.baseCampPersonalInformationPage().enterAddress1(BasePage.getRandomStringOfLength(6));
		entrataPages.baseCampPersonalInformationPage().enterAddress2(BasePage.getRandomStringOfLength(6));
		entrataPages.baseCampPersonalInformationPage().selectCountry("Ind", "India");
		entrataPages.baseCampPersonalInformationPage().enterCity(BasePage.getRandomStringOfLength(10));
		entrataPages.baseCampPersonalInformationPage().selectState("maha", "Maharashtra");
		entrataPages.baseCampPersonalInformationPage().enterZipPotalCode("411057");
		entrataPages.baseCampPersonalInformationPage().clickOnCancelButton();
		
		String baseCampAgendaPageTitle = entrataPages.agendaBaseCampPage().geTitleOfThePage();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(baseCampPageTitle, "Basecamp 2025 | Entrata", "Base Camp page title is not matched");
		softAssert.assertEquals(baseCampPersonalInformationPageTitle, "Personal Information - Base Camp 2025",
				"Personal Information page title is not matched");
		softAssert.assertEquals(baseCampAgendaPageTitle, "Agenda - Base Camp 2025", "Agenda page title is not matched");
		softAssert.assertAll();
	}
}
