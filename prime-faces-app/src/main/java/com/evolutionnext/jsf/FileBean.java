package com.evolutionnext.jsf;

import org.primefaces.model.UploadedFile;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FileBean {
    private UploadedFile uploadedFile;

    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }
}
