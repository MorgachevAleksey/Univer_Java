package com.fintech.practice4.task1;

//Просто дефолтный класс - одно поле стороны, да и реализация наследованных методов, как и circle, reactanglr
public class Square extends GeometricObject implements Colorable{
    private double side;

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public Square(){
        this.side = 0;
    }
    public Square(double side){
        this.side = side;
    }

    public double getArea(){
        double area = side * side;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 4 * side;
        return perimeter;
    }

    @Override
    public void howToColor(){
        System.out.println("Раскрасьте все четыре стороны.");
    }
}