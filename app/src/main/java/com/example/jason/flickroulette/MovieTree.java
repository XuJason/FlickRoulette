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
                URLLink, releaseDate, synopsis, poster,
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
                }
                else {
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

            System.out.println(movie.getTitle());
            System.out.println(movie.getRatings().getAvgScore());

            inOrderDisplay(movie.rightChild);
        }
    }

    public Movie findParent(Movie movie) {
        Movie current = root;

        while ((movie.leftChild!= current)
               && movie.rightChild !=current) {
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

    public Movie search(Movie movie) {
        Movie current = root;

        while (movie!= current) {
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

    public Movie findGreatest(){
        Movie current = root;

        while(current.rightChild != null){
            current = current.rightChild;
        }
        return current;

    }

    public Movie findLeast(){
        Movie current = root;

        while(current.leftChild != null){
            current = current.leftChild;
        }

        return current;
    }

    public Movie findNext(Movie movie) {
        Movie parent = findParent(movie);

        if(movie != findGreatest()) {

            if (search(movie).rightChild != null) {
                return movie.rightChild;
            } else {

                if (parent.leftChild == movie) {
                    return parent.leftChild;
                } else {
                    Movie current = parent;

                    while (parent.leftChild != current) {
                        current = parent;
                        parent = findParent(parent);
                    }

                    return parent;
                }
            }
        }
        return movie;
    }

    public Movie findPrev(Movie movie) {
        Movie parent = findParent(movie);

        if(movie != findLeast()) {

            if (search(movie).leftChild != null) {
                return movie.leftChild;
            } else {

                if (parent.rightChild == movie) {
                    return parent.rightChild;
                } else {
                    Movie current = parent;

                    while (parent.rightChild != current) {
                        current = parent;
                        parent = findParent(parent);
                    }

                    return parent;
                }
            }
        }
        return movie;
    }
}
