package com.example.android.englishtobangla;

public class Word {


    private String mDefaultTranslation;
    private String mBanglaTranslation;

    public Word(String mDefaultTranslation, String mBanglaTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mBanglaTranslation = mBanglaTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getBanglaTranslation() {
        return mBanglaTranslation;
    }
}
