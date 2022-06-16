package com.company.Singleton;

public enum EnumSingleton {
    INSTANCE;
    public String dbUrl = "http://something";

    public String getDbUrl(){
        return dbUrl;
    }
// Enums are basically classes with only a particular set
// of values
// enum Colour {
//   RED, = 0
//   BLUE, = 1
//   Green, = 2
// }
// enum Direction {
//   NORTH, South, East. West
// }
// Colour c = Colour.Green
// enums are integers behind the scene in other languages
// in java: enums are classes
// enums can have method
// effective java

// serializable
// thread safe


}
