package at.ac.fhcampuswien.fhmdb.StatePattern;

import at.ac.fhcampuswien.fhmdb.models.Movie;
import javafx.collections.ObservableList;

import java.util.Comparator;

public class AscendingState implements MovieSorterState {

    public void sort(ObservableList<Movie> movielist) {
        movielist.sort(Comparator.comparing(Movie::getTitle));
    }
}
