package com.fintech.practice4.task1;

//Просто дефолтный класс - тока ширина и длина, да и реализация наследованных методов, как и square, circle
public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        double area = width * height;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * (width + height);
        return perimeter;
    }
}