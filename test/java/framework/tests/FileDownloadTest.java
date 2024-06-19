package framework.tests;

import framework.Pages.FileDownloadPage;
import framework.Pages.MainPageNavigation;
import framework.utils.FileUtil;
import framework.utils.SettingsTestData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;


public class FileDownloadTest extends BaseTest {
    private final FileDownloadPage fileDownloadPage = new FileDownloadPage();
    public final String FILE_NAME = SettingsTestData.getFileData().getDownloadFile();
    public final String FILE_PATH = SettingsTestData.RESOURCE_FILE_PATH + FILE_NAME;
    private final File downloadedFile = new File(FILE_PATH);


    @Test
    public void fileUploadTest()
    {
       mainPage.clickNavigationLink(MainPageNavigation.FILE_DOWNLOAD);
       Assert.assertTrue(fileDownloadPage.isFileDownloadLinkDisplayed(FILE_NAME));
       fileDownloadPage.clickFileDownloadLink(FILE_NAME);
      // Assert.assertTrue(FileUtil.isFileExist(downloadedFile));
    }

    @AfterMethod
    public void deleteFile()
    {
        FileUtil.deleteFileIfExist(downloadedFile);
    }
}
