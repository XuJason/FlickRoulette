package com.example.jason.flickroulette;

/**
 * Created by Jason on 2015-06-19.
 */
public class Cast {
    private String mName, mCharacter;

    public Cast(String Name, String mharacter) {
        this.mName = mName;
        this.mCharacter = mCharacter;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getCharacter() {
        return mCharacter;
    }

    public void setCharacter(String mCharacter) {
        this.mCharacter = mCharacter;
    }
}
