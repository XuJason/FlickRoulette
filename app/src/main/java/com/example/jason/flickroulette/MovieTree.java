package com.example.jason.flickroulette;

import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Jason on 2015-06-21.
 */
public class MovieTree {

    Movie root;

    public void addMovie(String title, String year, String runtime,
                         String URLLink, String releaseDate, String synopsis,
                         String poster, Movie.Ratings ratings, Movie.Cast[] cast) {

        Movie newMovie = new Movie(title, year, runtime,
                URLLink, releaseDate, synopsis,poster,
                ratings, cast);

        if (root == null) {
            root = newMovie;
        } else {
            Movie current = root;
            Movie parent;

            while (true) {
                parent = current;

                if (ratings.getAvgScore() < current.getRatings().getAvgScore()) {
                    current = current.leftChild;

                    if (current == null) {
                        parent.leftChild = newMovie;

                        return;
                    }
                } else {
                    current = current.rightChild;

                    if (current == null) {
                        parent.rightChild = newMovie;

                        return;
                    }
                }
            }
        }
    }

    public void inOrderDisplay(Movie movie) {
        if (movie != null) {
            inOrderDisplay(movie.leftChild);

            //movie.Display(movie, movieView);
            System.out.println(movie.getTitle());
            System.out.println(movie.getRatings().getAvgScore());

            inOrderDisplay(movie.rightChild);
        }
    }

    public Movie findParent(Movie movie) {
        Movie current = root;

        while ((movie.leftChild.getRatings().getAvgScore() != current.getRatings().getAvgScore())
               && movie.rightChild.getRatings().getAvgScore() != current.getRatings().getAvgScore()) {
            if (current.getRatings().getAvgScore() < movie.getRatings().getAvgScore()) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public Movie findNext(Movie movie) {
        Movie current = root;
        Movie next = current;
        if(movie.leftChild != null){
            return movie.leftChild;
        }

        return movie;
    }

    public Movie findPrev(Movie movie) {
        Movie current = root;


        return movie.rightChild;
    }
}
