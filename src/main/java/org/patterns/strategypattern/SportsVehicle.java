package org.patterns.strategypattern;

import org.patterns.strategypattern.strategy.FourWheelDrive;

public class SportsVehicle extends Vehicle {
     SportsVehicle() {
        super(new FourWheelDrive());
    }
}
