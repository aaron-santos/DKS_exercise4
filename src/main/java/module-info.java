module at.ac.fhcampuswien.fhmdb {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.jfoenix;
    requires okhttp3;
    requires com.google.gson;
    requires ormlite.jdbc;
    requires java.sql;

    opens at.ac.fhcampuswien.fhmdb.models to com.google.gson;
    opens at.ac.fhcampuswien.fhmdb.database to ormlite.jdbc;

    opens at.ac.fhcampuswien.fhmdb to javafx.fxml;
    exports at.ac.fhcampuswien.fhmdb.models;
    exports at.ac.fhcampuswien.fhmdb;
    exports at.ac.fhcampuswien.fhmdb.controllers;
    opens at.ac.fhcampuswien.fhmdb.controllers to javafx.fxml;
    exports at.ac.fhcampuswien.fhmdb.FactoryPattern;
    opens at.ac.fhcampuswien.fhmdb.FactoryPattern to javafx.fxml;
    exports at.ac.fhcampuswien.fhmdb.StatePattern;
    opens at.ac.fhcampuswien.fhmdb.StatePattern to com.google.gson;
}