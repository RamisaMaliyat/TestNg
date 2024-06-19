package framework.Pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class FileUploadPage extends Form
{
    private final  static String name = "File Upload";
    private static final By ChooseFile = By.id("file-upload" );
    private static final By SubmitFile = By.id("file-submit");
    private static final ITextBox FileNameInput = AqualityServices.getElementFactory().getTextBox(ChooseFile,"Uploaded");

    private static final IButton FileSumbitBtn = AqualityServices.getElementFactory().getButton(SubmitFile,"Submitted");
    public FileUploadPage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,name)),name);
    }
    public static void UploadFile(String filename)
    {
        FileNameInput.clearAndType(filename);
    }
    public static void clicksubmitbtn()
    {
        FileSumbitBtn.click();
    }
}
