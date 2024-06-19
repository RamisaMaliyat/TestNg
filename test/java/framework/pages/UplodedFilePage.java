package framework.Pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class UplodedFilePage extends Form
{
    public static final String name = "File Uploaded!";
    private static final By FileName = By.id("uploaded-files");
    private static final ILabel UploadedFile = AqualityServices.getElementFactory().getLabel(FileName,"FileName");

    public UplodedFilePage()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,name)),name);
    }
    public static String getfilename()
    {
        return UploadedFile.getText();
    }
}
