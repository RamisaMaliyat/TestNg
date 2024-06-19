package framework.tests;

import aquality.selenium.browser.AlertActions;
import framework.Pages.JavaScriptAlertsPage;
import framework.Pages.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    private final JavaScriptAlertsPage javaScriptAlertsPage =new JavaScriptAlertsPage();
    @Test
    public void alertTest()
    {
        mainPage.clickNavigationLink(MainPageNavigation.JAVASCRIPT_ALERT);
        javaScriptAlertsPage.clickForJsAlertBtn();
        browser.handleAlert(AlertActions.ACCEPT);
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success msg is not displayed");
    }

}
