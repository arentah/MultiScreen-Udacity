package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Aren on 4/1/2017.
 */

public class Word {

    private String defaultWord;
    private String miwokWord;
    private int mImageresource;

    public Word(String mDefault, String mMiwok, int ImageResource){
        miwokWord = mMiwok;
        defaultWord = mDefault;
        mImageresource = ImageResource;
    }

    public Word(String mDefault, String mMiwok){
        miwokWord = mMiwok;
        defaultWord = mDefault;
        mImageresource = 0;
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

}
