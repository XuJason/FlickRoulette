package com.example.jason.flickroulette;

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

    public Ratings getRatings(){
        return mRatings;
    }

    public void Display(Movie movie, LinearLayout movieView, TextView titleView,
                        TextView yearView, TextView URLLinkView, TextView releaseDateView,
                        TextView synopsisView, TextView ratingsView, TextView castView,
                        ImageView poster) {
        titleView.setText(movie.mTitle);



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
