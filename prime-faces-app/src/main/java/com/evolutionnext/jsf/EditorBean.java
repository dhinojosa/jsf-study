package com.evolutionnext.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EditorBean {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
