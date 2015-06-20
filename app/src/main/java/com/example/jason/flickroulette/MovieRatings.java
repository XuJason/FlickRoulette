package com.example.jason.flickroulette;

/**
 * Created by Jason on 2015-06-19.
 */
public class MovieRatings {

    private String mCriticsRating, mAudienceRating;
    private int mCriticsScore, mAudienceScore;

    public String getCriticsRating() {
        return mCriticsRating;
    }

    public void setCriticsRating(String mCriticsRating) {
        this.mCriticsRating = mCriticsRating;
    }

    public String getAudienceRating() {
        return mAudienceRating;
    }

    public void setAudienceRating(String mAudienceRating) {
        this.mAudienceRating = mAudienceRating;
    }

    public int getCriticsScore() {
        return mCriticsScore;
    }

    public void setCriticsScore(int mCriticsScore) {
        this.mCriticsScore = mCriticsScore;
    }

    public int getAudienceScore() {
        return mAudienceScore;
    }

    public void setAudienceScore(int mAudienceScore) {
        this.mAudienceScore = mAudienceScore;
    }


    public MovieRatings(String mCriticsRating, String mAudienceRating,
                        int mCriticsScore, int mAudienceScore) {
        this.mCriticsRating = mCriticsRating;
        this.mAudienceRating = mAudienceRating;
        this.mCriticsScore = mCriticsScore;
        this.mAudienceScore = mAudienceScore;
    }
}
