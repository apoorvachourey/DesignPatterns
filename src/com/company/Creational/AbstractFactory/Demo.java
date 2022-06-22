package com.company.Creational.AbstractFactory;

import com.company.Creational.AbstractFactory.Factories.GUIFactory;
import com.company.Creational.AbstractFactory.Factories.MacOsFactory;
import com.company.Creational.AbstractFactory.Factories.WindowsFactory;

import java.util.Locale;

/**
Everything Comes Together here!
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */

    private static Application configApp(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOsFactory();
            app = new Application(factory);
        }else{
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return  app;
    }

    public static void main(String[] args) {
        Application app = configApp();
        app.paint();
    }

}
//https://refactoring.guru/design-patterns/abstract-factory/java/example