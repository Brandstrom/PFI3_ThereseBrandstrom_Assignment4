package com.example.therese.pfi3_theresebrandstrom_assignment4;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Therese on 15-04-22.
 */
public class Planet implements Serializable {
    String name;
    String radie;
    String medeltemp;
    String info;
    Drawable image;
    int imageIndex;

    public Planet(String name, String info, String radie, String medeltemp, int imageIndex) {
        this.name = name;
        this.info = info;
        this.radie = radie;
        this.medeltemp = medeltemp;
        this.imageIndex = imageIndex;
    }
    public Planet(String name, String info, String radie, String medeltemp, Drawable image) {
        this.name = name;
        this.info = info;
        this.radie = radie;
        this.medeltemp = medeltemp;
        this.image= image;
    }

    public String getInfo() {
        return info;
    }


    public int getImageIndex() {
        return imageIndex;
    }

    public void setImage(int _imageIndex) {
        imageIndex=_imageIndex;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public String getMedeltemp() {
        return medeltemp;
    }

    public String getRadie() {
        return radie;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getSummary() {
        return "Radie: "+radie+"\n"+"Medeltemp: "+medeltemp;
    }
}
