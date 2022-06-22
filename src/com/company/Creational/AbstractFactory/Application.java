package com.company.Creational.AbstractFactory;

import com.company.Creational.AbstractFactory.Buttons.Button;
import com.company.Creational.AbstractFactory.CheckBoxes.CheckBox;
import com.company.Creational.AbstractFactory.Factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }

}
