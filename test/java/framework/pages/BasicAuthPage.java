package framework.Pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class BasicAuthPage extends Form {
    private static final String NAME = "Basic Auth";
    private final By SUCCESS_AUTH= By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH,"Congratulations! You must have the proper credentials."));
    private final ILabel success_level = AqualityServices.getElementFactory().getLabel(SUCCESS_AUTH,"success");

    public BasicAuthPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public boolean isSuccessMsgDisplayed()
    {
            return success_level.state().isDisplayed();
    }
}
