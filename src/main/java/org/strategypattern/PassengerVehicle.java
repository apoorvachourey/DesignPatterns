package org.strategypattern;

import org.strategypattern.strategy.DriveStrategy;
import org.strategypattern.strategy.TwoWheelDrive;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new TwoWheelDrive());
    }
}
