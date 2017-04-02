package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Aren on 4/1/2017.
 */

public class Word {

    private String miwokWord;
    private String defaultWord;

    public Word(String mMiwok, String mDefault){
        miwokWord = mMiwok;
        defaultWord = mDefault;
    }

    public String getMiwokWord(Context context){
        return miwokWord;
    }

    public String getDefaultWord(Context context){
        return defaultWord;
    }

}
