package com.company.Singleton;

import com.company.Singleton.Singleton;

import java.util.Stack;

public class Client {

    public static void main(String[] args) {
	// write your code here
       // Singleton s = new Singleton(); - this gives error that constructor is private
        Singleton db1 = Singleton.getInstance();
        Singleton db2 = Singleton.getInstance();

        //Singleton connection = Singleton.INSTANCE;
       // connection.getDbUrl();

        EnumSingleton conn2 = EnumSingleton.INSTANCE;
        conn2.getDbUrl();
    }
}
