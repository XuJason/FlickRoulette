package com.example.jason.flickroulette;

import android.app.Fragment;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Jason on 2015-06-19.
 */
public class Movie {
    Movie leftChild;
    Movie rightChild;

    private String mTitle, mYear,
        mRuntime,mURLLink,mReleaseDate, mSynopsis, mPoster;
    private Ratings mRatings;
    private Cast[] mCast;

    public Movie(String title, String year, String runtime,
                 String URLLink, String releaseDate,
                 String synopsis, String poster, Ratings ratings, Cast[] cast) {

        mTitle = title;
        mYear = year;
        mRuntime = runtime;
        mURLLink = URLLink;
        mReleaseDate = releaseDate;
        mSynopsis = synopsis;
        mPoster = poster;
        mRatings = ratings;
        mCast = cast;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getYear() {
        return mYear;
    }

    public String getRuntime() {
        return mRuntime;
    }

    public String getURLLink() {
        return mURLLink;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public String getSynopsis() {
        return mSynopsis;
    }

    public String getPoster() {
        return mPoster;
    }

    public Cast[] getCast() {
        return mCast;
    }

    public Ratings getRatings(){
        return mRatings;
    }


    /**
     * Created by Jason on 2015-06-19.
     */
    public static class Cast {
        private String mName, mCharacter;

        public Cast(String Name, String mCharacter) {
            this.mName = Name;
            this.mCharacter = mCharacter;
        }

    }

    /**
     * Created by Jason on 2015-06-19.
     */
    public static class Ratings {

        private String mCriticsRating, mAudienceRating;
        private int mCriticsScore, mAudienceScore, mAvgScore;

        public Ratings(String mCriticsRating, String mAudienceRating,
                       int mCriticsScore, int mAudienceScore) {
            this.mCriticsRating = mCriticsRating;
            this.mAudienceRating = mAudienceRating;
            this.mCriticsScore = mCriticsScore;
            this.mAudienceScore = mAudienceScore;
            mAvgScore = (mCriticsScore+mAudienceScore)/2;
        }

        public int getAvgScore(){
            return mAvgScore;
        }
    }
}
