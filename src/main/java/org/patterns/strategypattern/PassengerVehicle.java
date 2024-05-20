package org.patterns.strategypattern;

import org.patterns.strategypattern.strategy.TwoWheelDrive;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new TwoWheelDrive());
    }
}
