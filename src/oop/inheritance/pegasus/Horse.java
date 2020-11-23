package oop.inheritance.pegasus;

import java.awt.*;

public class Horse {
    private String name;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

//    public Horse(String name, Color color) {
//        this.name = name;
//        this.color = color;
//    }

    public void go() {
        // some code
    }

    public void voice() {
        System.out.println("И-го-го");
    }
}
