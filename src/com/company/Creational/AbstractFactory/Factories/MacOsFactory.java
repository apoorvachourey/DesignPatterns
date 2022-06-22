package com.company.Creational.AbstractFactory.Factories;

import com.company.Creational.AbstractFactory.Buttons.Button;
import com.company.Creational.AbstractFactory.Buttons.MacOSButtons;
import com.company.Creational.AbstractFactory.CheckBoxes.CheckBox;
import com.company.Creational.AbstractFactory.CheckBoxes.MacOsCheckBox;
import com.company.Creational.AbstractFactory.CheckBoxes.WindowsCheckBox;

public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButtons();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}
