package com.ejercicios.keka.kekaandroidcv;

import java.util.UUID;

/**
 * Created by Keka on 09/02/2017.
 */

public class Experiencia {

    private String mId;
    private String mName;
    private String mCompany;
    private int mImage;

    public Experiencia (String name, String company, int image){
        mId = UUID.randomUUID().toString();
        mName = name;
        mCompany = company;
        mImage = image;
    }

    public String getId(){
        return mId;
    }
    public void setId(String mId){
        this.mId = mId;
    }

    public String getName() {
        return mName;
    }
    public void setName(String mName) {
        this.mName = mName;
    }

    public String getCompany() {
        return mCompany;
    }
    public void setCompany(String mCompany) {
        this.mCompany = mCompany;
    }

    public int getImage() {
        return mImage;
    }
    public void setImage(int mImage) {
        this.mImage = mImage;
    }

    public String toString(){
        return "Experiencia{"+
                "ID='" + mId + '\'' +
                ", Empresa='" + mCompany + '\'' +
                ", Puesto='" + mName + '\'' +
                '}';
    }
}
