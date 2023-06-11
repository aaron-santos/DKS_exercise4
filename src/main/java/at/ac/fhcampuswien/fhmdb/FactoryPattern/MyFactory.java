package at.ac.fhcampuswien.fhmdb.FactoryPattern;


import javafx.util.Callback;

import java.util.HashMap;
import java.util.Map;

public class MyFactory implements Callback<Class<?>, Object> {

    //MainController.class -> new MainController()
    //MovieController.class -> new MovieController()
    //MainController.class -> new MainController()

    private static MyFactory instance;

    private MyFactory() {

    }

    public static MyFactory getInstance() {
        if (instance == null) {
            instance = new MyFactory();
        }
        return instance;
    }

        @Override
        //returns singleton instance of controller, because it is not possible to implement singleton in javafx
        public Object call(Class<?> aClass) {
            try{
                return aClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

}


