package com.example.recyclerview;

public class FruitModel {
    String frname;
    int image;


    public FruitModel(String frname, int image) {
        this.frname = frname;
        this.image = image;
    }

    public String getFrname() {
        return frname;
    }

    public void setFrname(String frname) {
        this.frname = frname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
