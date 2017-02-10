package com.ejercicios.keka.kekaandroidcv;

import java.util.UUID;

/**
 * Created by Keka on 09/02/2017.
 */

public class Estudios {
        private String mId;
        private String mName;
        private String mCentro;
        private int mImage;

        public Estudios (String name, String centro, int image){
            mId = UUID.randomUUID().toString();
            mName = name;
            mCentro = centro;
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
            return mCentro;
        }
        public void setCompany(String mCompany) {
            this.mCentro = mCentro;
        }

        public int getImage() {
            return mImage;
        }
        public void setImage(int mImage) {
            this.mImage = mImage;
        }

        public String toString(){
            return "Estudios{"+
                    "ID='" + mId + '\'' +
                    ", Centro='" + mCentro + '\'' +
                    ", Estudios='" + mName + '\'' +
                    '}';
        }
}
