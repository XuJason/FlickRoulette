package com.example.jason.flickroulette;

/**
 * Created by Jason on 2015-06-19.
 */
public class Movie {
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

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getYear() {
        return mYear;
    }

    public void setYear(String year) {
        mYear = year;
    }

    public String getRuntime() {
        return mRuntime;
    }

    public void setRuntime(String runtime) {
        mRuntime = runtime;
    }

    public String getURLLink() {
        return mURLLink;
    }

    public void setURLLink(String URLLink) {
        mURLLink = URLLink;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    public String getSynopsis() {
        return mSynopsis;
    }

    public void setSynopsis(String synopsis) {
        mSynopsis = synopsis;
    }

    public MovieRatings getRatings() {
        return mRatings;
    }

    public void setRatings(MovieRatings ratings) {
        mRatings = ratings;
    }

    public Cast[] getCast() {
        return mCast;
    }

    public void setCast(Cast[] cast) {
        mCast = cast;
    }
}
