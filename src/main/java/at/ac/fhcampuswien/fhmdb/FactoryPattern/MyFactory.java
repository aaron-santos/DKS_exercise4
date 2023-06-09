package at.ac.fhcampuswien.fhmdb.FactoryPattern;


import javafx.util.Callback;

import java.util.HashMap;
import java.util.Map;

public class MyFactory implements Callback<Class<?>, Object> {

    private final Map<Class<?>, Object> controllerInstanceMap;
    //MainController.class -> new MainController()
    //MovieController.class -> new MovieController()
    //MainController.class -> new MainController()

    public MyFactory(){
        controllerInstanceMap = new HashMap<>();
    }


        @Override
        //returns singleton instance of controller, because it is not possible to implement singleton in javafx
        public Object call(Class<?> aClass) {
            //System.out.println("call");

            if (controllerInstanceMap.containsKey(aClass)) {
               // System.out.println("already exist");
                Object instance = controllerInstanceMap.get(aClass);
                return instance;
            } else {
                try {
                //    System.out.println("new instance");
                    Object instance = aClass.getDeclaredConstructor().newInstance();
                    controllerInstanceMap.put(aClass, instance);
                    return instance;

                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
    }


