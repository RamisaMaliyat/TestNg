package framework.tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import framework.Pages.MainPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
    protected MainPage mainPage = new MainPage();
    protected Browser browser;

    @BeforeMethod
    public  void setup()
    {
        browser= AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo("https://the-internet.herokuapp.com/");
        browser.waitForPageToLoad();

    }
    @AfterMethod
    public void teardown()
    {
        browser.quit();
    }

}
