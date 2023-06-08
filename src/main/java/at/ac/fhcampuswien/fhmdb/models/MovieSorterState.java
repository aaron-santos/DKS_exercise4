package at.ac.fhcampuswien.fhmdb.models;

import javafx.collections.ObservableList;

import java.util.List;

public interface MovieSorterState {
    void sort(ObservableList<Movie> movieList);
}
