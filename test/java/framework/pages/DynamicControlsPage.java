package framework.Pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class DynamicControlsPage extends Form {

  private static final String name = "Dynamic Controls";
  private final IElementFactory elementFactory=AqualityServices.getElementFactory();
  private  final By enable = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,"Enable"));
  private final By  Input = By.xpath("//*[@id='input-example']//input");

  private final IButton enables = elementFactory.getButton(enable,"enable");
  private final ITextBox TextField = elementFactory.getTextBox(Input,"Input Field");

    public DynamicControlsPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,name)),name);
    }
    public void clickButton()
    {
        enables.click();;
    }
    public void InputText (String text)
    {
        TextField.clearAndType(text);
    }
    public  boolean IsInputEnable()
    {
        return TextField.state().waitForEnabled();
    }
    public  String getinputtextvalue()
    {
        return TextField.getText();
    }
}
