package com.example.jason.flickroulette;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MovieActivity extends ActionBarActivity {
    private Button mLeftButton;
    private Button mRightButton;
    private Movie current;
    private MovieTree movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        Intent intent = getIntent();

        movieList = new MovieTree();

        movieList.addMovie("Kingsman: The Secret Service",
                "2015",
                "129 min",
                "http://www.imdb.com/title/tt2802144/",
                "29 January",
                "A spy organization recruits an unrefined, but promising " +
                        "street kid into the agency's ultra-competitive " +
                        "training program, just as a global threat emerges " +
                        "from a twisted tech genius.",
                "http://www.imdb.com/media/rm2716924928/tt2802144?ref_=tt_ov_i#",
                new Movie.Ratings("34343", "fefefefe", 69, 68)
                , new Movie.Cast[]{new Movie.Cast("Jason", "Xu")});

        movieList.addMovie("Django Unchained",
                "2012",
                "165 min",
                "http://www.rottentomatoes.com/m/django_unchained_2012/",
                "25 Dec",
                "Set in the South two years before the Civil War, Django Unchained " +
                        "stars Jamie Foxx as Django, a slave whose brutal history " +
                        "with his former owners lands him face-to-face with German-born" +
                        " bounty hunter Dr. King Schultz (Christoph Waltz). Schultz is" +
                        " on the trail of the murderous Brittle brothers, and only Django" +
                        " can lead him to his bounty. Honing vital hunting skills, Django" +
                        " remains focused on one goal: finding and rescuing Broomhilda " +
                        "(Kerry Washington), the wife he lost to the slave trade long ago." +
                        " Django and Schultz's search ultimately leads them to Calvin Candie " +
                        "(Leonardo DiCaprio), the proprietor of \"Candyland,\" an infamous " +
                        "plantation. Exploring the compound under false pretenses, Django and " +
                        "Schultz arouse the suspicion of Stephen (Samuel L. Jackson), Candie's " +
                        "trusted house slave. -- (C) Weinstein",
                "http://www.imdb.com/media/rm2716924928/tt2802144?ref_=tt_ov_i#",
                new Movie.Ratings("34343", "fefefefe", 33, 33)
                , new Movie.Cast[]{new Movie.Cast("Jamie Foxx", "Django")});

        current = movieList.root;

        Display(current);
        mLeftButton = (Button) findViewById(R.id.leftButton);
        mRightButton = (Button) findViewById(R.id.rightButton);

        mLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeMovies(true);
            }
        });

        mRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeMovies(false);
            }
        });

    }

    public void Display(Movie movie) {
        TextView mTitleView = (TextView) findViewById(R.id.title);
        TextView mYearView = (TextView) findViewById(R.id.year);
        TextView mRunTimeView = (TextView) findViewById(R.id.runtime);
        TextView mLinkView = (TextView) findViewById(R.id.link);
        TextView mReleaseDateView = (TextView) findViewById(R.id.releaseDate);
        TextView mSynopsisView = (TextView) findViewById(R.id.synopsis);

        mTitleView.setText(movie.getTitle());
        mYearView.setText(movie.getYear());
        mRunTimeView.setText(movie.getRuntime());
        mLinkView.setText(movie.getURLLink());
        mReleaseDateView.setText(movie.getReleaseDate());
        mSynopsisView.setText(movie.getSynopsis());
    }

    public void changeMovies(boolean direction){
        if(direction = true){
            current = movieList.findNext(current);
        }
        else{
            current = movieList.findPrev(current);
        }
        Display(current);
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movie, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}
