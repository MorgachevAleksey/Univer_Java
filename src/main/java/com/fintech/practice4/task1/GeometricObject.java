package com.fintech.practice4.task1;

import java.util.Date;

public abstract class GeometricObject implements Comparable {
    private String color;
    private boolean isFilled;
    private Date dateCreated = new Date();

    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public GeometricObject(){

    }
    public GeometricObject(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    //Переопределение метода который есть у всех обьектов
    @Override
    public String toString(){
        return "Создан: " + dateCreated + "\n" +
                "Цвет: " + color + "\n" +
                "Заливка: " + isFilled;
    }

    //Вообще тут принцип как с интерфейсом - обьявляешь методы а наследники уже пусть реализовывают
    public abstract double getArea();
    public abstract double getPerimeter();

    //Т.к. реализует Comparable нужно прописать реализацию (ну так как она уже в оригинальном интерфейсе - переопределить)
    //Фактически метод вызывается у обьекта любого класса и сравнивает с полученным другим обьектом любого класса
    @Override
    public int compareTo(Object object){
        GeometricObject figure = (GeometricObject) object;

        //У нас очевидно сравнивает по плозади
        if (this.getArea() > figure.getArea()) {
            return 1;
        } else if (this.getArea() < figure.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    //Ну а здесь мы просто используем красиво наше переопределенное сравнение по площади
    public static GeometricObject max(GeometricObject figure1, GeometricObject figure2){
        if (figure1.compareTo(figure2) >= 0) {
            return figure1;
        } else {
            return figure2;
        }
    }
}