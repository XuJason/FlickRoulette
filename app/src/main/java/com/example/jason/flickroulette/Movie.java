package com.example.jason.flickroulette;

/**
 * Created by Jason on 2015-06-19.
 */
public class Movie {
    Movie leftChild;
    Movie rightChild;

    private String mTitle, mDescription, mYear,
        mRuntime,mURLLink,mReleaseDate, mSynopsis;
    private MovieRatings mRatings;
    private Cast[] mCast;

    public Movie(String title, String description,
                 String year, String runtime, String URLLink,
                 String releaseDate, String synopsis,
                 MovieRatings ratings, Cast[] cast) {
        mTitle = title;
        mDescription = description;
        mYear = year;
        mRuntime = runtime;
        mURLLink = URLLink;
        mReleaseDate = releaseDate;
        mSynopsis = synopsis;
        mRatings = ratings;
        mCast = cast;
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
    public static class MovieRatings {

        private String mCriticsRating, mAudienceRating;
        private int mCriticsScore, mAudienceScore;

        public MovieRatings(String mCriticsRating, String mAudienceRating,
                            int mCriticsScore, int mAudienceScore) {
            this.mCriticsRating = mCriticsRating;
            this.mAudienceRating = mAudienceRating;
            this.mCriticsScore = mCriticsScore;
            this.mAudienceScore = mAudienceScore;
        }
    }
}
