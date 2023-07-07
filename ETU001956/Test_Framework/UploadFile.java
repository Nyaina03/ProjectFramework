package etu001956.test_framework;

public class UploadFile {
    private String fileName;
    private String filePath;
    private long fileSize;

    public UploadFile(String fileName, String filePath, long fileSize) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

     public void setUploadFile(UploadFile uploadFile) {
        this.uploadFile = uploadFile;
    }
}
