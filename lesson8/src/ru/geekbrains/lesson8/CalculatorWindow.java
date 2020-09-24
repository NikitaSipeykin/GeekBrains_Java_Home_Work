package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindow extends JFrame {
    public CalculatorWindow(){
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,260,350);
        add(new Panel());
        setResizable(false);
        setVisible(true);

    }
}
