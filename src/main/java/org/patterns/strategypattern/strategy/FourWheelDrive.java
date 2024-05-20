package org.patterns.strategypattern.strategy;

public class FourWheelDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is four wheel drive vehicle");
    }
}
