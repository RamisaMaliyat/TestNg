package framework.models;

import lombok.Getter;

@Getter
public class FileData {
    private String uploadFile;
    private String downloadFile;

    public String getDownloadFile()
    {
        return downloadFile;
    }

    public String getUploadFile()
    {
        return uploadFile;
    }
}
