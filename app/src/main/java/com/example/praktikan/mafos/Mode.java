package com.example.praktikan.mafos;

import java.io.Serializable;

public class Mode implements Serializable {

    private String jenisMode;

    public String getJenisMode() {
        return jenisMode;
    }

    public void setJenisMode(String jenisMode) {
        this.jenisMode = jenisMode;
    }

    public static Mode generateMode(String jenisMode){
        Mode mode = new Mode();
        mode.setJenisMode(jenisMode);
        return mode;
    }
}