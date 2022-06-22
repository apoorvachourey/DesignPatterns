package com.company.Creational.AbstractFactory.Factories;

import com.company.Creational.AbstractFactory.Buttons.Button;
import com.company.Creational.AbstractFactory.Buttons.MacOSButtons;
import com.company.Creational.AbstractFactory.Buttons.WindowsButton;
import com.company.Creational.AbstractFactory.CheckBoxes.CheckBox;
import com.company.Creational.AbstractFactory.CheckBoxes.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
