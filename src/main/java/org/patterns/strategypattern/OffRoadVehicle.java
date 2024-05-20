package org.patterns.strategypattern;

import org.patterns.strategypattern.strategy.FourWheelDrive;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new FourWheelDrive()); // you need to pass the strategy here specific to vehicle
    }
}
