package com.company.Creational.AbstractFactory.Buttons;

import com.company.Creational.AbstractFactory.Buttons.Button;

public class MacOSButtons implements Button {
    @Override
    public void paint() {
        System.out.println("Mac OS Button !");
    }
}
