package org.strategypattern;

import org.strategypattern.strategy.DriveStrategy;
import org.strategypattern.strategy.FourWheelDrive;

public class SportsVehicle extends Vehicle {
     SportsVehicle() {
        super(new FourWheelDrive());
    }
}
