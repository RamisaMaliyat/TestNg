package framework.Pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class MainPage extends Form {

    public MainPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,"Welcome to the-internet")), "Main Page");
    }
    private ILink getNavigationLink(framework.Pages.MainPageNavigation navigation) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,
                navigation.label)), navigation.label);
    }


    public void clickNavigationLink(framework.Pages.MainPageNavigation navigation)
    {
        getNavigationLink(navigation).click();
    }
}
