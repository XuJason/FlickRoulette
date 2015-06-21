package com.example.jason.flickroulette;

/**
 * Created by Jason on 2015-06-21.
 */
public class MovieTree {

    Movie root;

    public void addMovie(String title, String description,
                         String year, String runtime, String URLLink,
                         String releaseDate, String synopsis,
                         Movie.Ratings ratings, Movie.Cast[] cast) {

        Movie newMovie = new Movie(title, description, year, runtime,
                                    URLLink, releaseDate, synopsis,
                                    ratings, cast);

        if(root == null){
            root = newMovie;
        }
        else{
            Movie current = root;
            Movie parent;

            while(true) {
                parent = current;

                if (ratings.getAvgScore() < current.getRatings().getAvgScore()) {
                    current = current.leftChild;

                    if (current == null) {
                        parent = parent.leftChild;

                        return;
                    }
                }
                else{
                    current = current.rightChild;

                    if(current == null){
                        parent = parent.rightChild;

                        return;
                    }
                }
            }
        }
    }
}
