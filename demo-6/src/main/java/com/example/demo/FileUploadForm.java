package com.example.demo;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadForm {
	private MultipartFile fileData;

    public MultipartFile getFileData() {
        return fileData;
    }

    public void setFileData(MultipartFile fileData) {
        this.fileData = fileData;
    }
}
