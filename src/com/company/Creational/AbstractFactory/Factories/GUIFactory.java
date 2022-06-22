package com.company.Creational.AbstractFactory.Factories;

import com.company.Creational.AbstractFactory.Buttons.Button;
import com.company.Creational.AbstractFactory.CheckBoxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
