package com.fintech.practice4.task1;

//Просто дефолтный класс - только радиус, да и реализация наследованных методов, как и square, rectangle
public class Circle extends GeometricObject{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}