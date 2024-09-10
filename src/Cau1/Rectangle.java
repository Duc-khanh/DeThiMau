package Cau1;

import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
    private double width;
    private double height;



    public Rectangle(String shapeName, String color, double width, double height) {
        super(shapeName, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double calArea(){
        return width * height;
    }

}
