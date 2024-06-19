package framework.tests;

import framework.Pages.DynamicControlsPage;
import framework.Pages.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class DynamicControlsTest extends BaseTest {
    private final DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    private final String RANDOM_TEXT = UUID.randomUUID().toString();

    @Test
    public void dynamicControlsTest()
    {
        mainPage.clickNavigationLink(MainPageNavigation.DYNAMIC_CONTROLS);
        dynamicControlsPage.clickButton();
        Assert.assertTrue(dynamicControlsPage.IsInputEnable(),"Input is not enabled");
        dynamicControlsPage.InputText(RANDOM_TEXT);
        Assert.assertTrue(dynamicControlsPage.getinputtextvalue().isEmpty(),"Text filed is empty");
    }
}
