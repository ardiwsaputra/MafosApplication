package com.example.praktikan.mafos;

import java.io.Serializable;

public class Design implements Serializable {
    private String jenisDesign;

    public String getJenisDesign() {
        return jenisDesign;
    }

    public void setJenisDesign(String jenisDesign) {
        this.jenisDesign = jenisDesign;
    }

    public static Design generateDesign(String jenisDesign){
        Design design = new Design();
        design.setJenisDesign(jenisDesign);
        return design;
    }
}
