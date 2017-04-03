package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Aren on 4/1/2017.
 */

public class Word {

    private final int No_Image = -1;
    private String defaultWord;
    private String miwokWord;
    private int mImageresource = No_Image;

    public Word(String mDefault, String mMiwok, int ImageResource){
        miwokWord = mMiwok;
        defaultWord = mDefault;
        mImageresource = ImageResource;
    }

    public Word(String mDefault, String mMiwok){
        miwokWord = mMiwok;
        defaultWord = mDefault;
    }

    public String getMiwokWord(){
        return miwokWord;
    }

    public String getDefaultWord(){
        return defaultWord;
    }

    public int getmImageresource(){
        return mImageresource;
    }

    public boolean hasImage(){
        return mImageresource != No_Image;
    }

}
