package framework.tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import framework.LocatorConstants;
import framework.Pages.BasicAuthPage;
import framework.Pages.MainPageNavigation;
import framework.utils.SettingsTestData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest {
    private final BasicAuthPage basicAuthPage = new BasicAuthPage();

    private final String msg = "Congratulations! You must have the proper credentials.";

    @BeforeMethod
    public void auth() {
        browser.network().addBasicAuthentication
                (
                SettingsTestData.getEnvData().getDomain(),
                SettingsTestData.getUserData().getUsername(), // Corrected method call
                SettingsTestData.getUserData().getPassward() // Corrected method call, assuming there's a method like getPasswardData()
        );
    }

    @Test
    public void basicAuthTest() {
       mainPage.clickNavigationLink(MainPageNavigation.BASIC_AUTH);
        Assert.assertNotEquals(basicAuthPage.isSuccessMsgDisplayed(),msg,"Message are not displayed");
    }
}
