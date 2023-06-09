package at.ac.fhcampuswien.fhmdb.StatePattern;

import at.ac.fhcampuswien.fhmdb.models.Movie;
import javafx.collections.ObservableList;

import java.util.List;

public interface MovieSorterState {
    void sort(ObservableList<Movie> movieList);
}
