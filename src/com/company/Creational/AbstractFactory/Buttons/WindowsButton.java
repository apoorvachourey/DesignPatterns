package com.company.Creational.AbstractFactory.Buttons;

import com.company.Creational.AbstractFactory.Buttons.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button!");
    }
}
