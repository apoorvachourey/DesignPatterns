package org.patterns.strategypattern.strategy;

public class TwoWheelDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is two wheel Drive vehicle");
    }
}
