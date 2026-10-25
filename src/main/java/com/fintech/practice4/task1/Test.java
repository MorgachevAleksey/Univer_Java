package com.fintech.practice4.task1;

import java.util.Scanner;

//Спаси и сохрани
public class Test {
    public static void main(String[] args) {
        //Сразу создание несуществующеего чтобы отработала ошибка (метод в самом низу)
        Triangle triangle1 = createTriangle(3, 4, 55);

        System.out.println(triangle1);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getArea());

        //Создание обьекта треугольника, задание цвета, заливки
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую сторону: ");
        double side1 = scanner.nextDouble();
        System.out.print("Введите вторую сторону: ");
        double side2 = scanner.nextDouble();
        System.out.print("Введите третью сторону: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введите цвет: ");
        String color = scanner.nextLine();
        System.out.print("Треугольник закрашен? true или false: ");
        boolean isFilled = scanner.nextBoolean();

        Triangle triangle2 = createTriangle(side1, side2, side3);
        triangle2.setColor(color);
        triangle2.setFilled(isFilled);

        System.out.println(triangle2);
        System.out.println("Площадь: " + triangle2.getArea());
        System.out.println("Периметр: " + triangle2.getPerimeter());
        System.out.println("Цвет: " + triangle2.getColor());
        System.out.println("Заливка: " + triangle2.isFilled());

        //Задание 3 max
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3);

        GeometricObject maxCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Площадь большего круга: " + maxCircle.getArea());

        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(5, 6);

        GeometricObject maxRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Площадь большего прямоугольника: " + maxRectangle.getArea()); //ловит даже в систем ауте (боже это поплава...)

        //compareTo для двух ComparableCircle
        ComparableCircle comparableCircle1 = new ComparableCircle(4);
        ComparableCircle comparableCircle2 = new ComparableCircle(5);

        if (comparableCircle1.compareTo(comparableCircle2) >= 0) {
            System.out.println("Радиус большего ComparableCircle: " + comparableCircle1.getRadius());
        } else {
            System.out.println("Радиус большего ComparableCircle: " + comparableCircle2.getRadius());
        }

        //compareTo для круга и прямоугольника
        if (circle1.compareTo(rectangle1) >= 0) {
            System.out.println("Больше круг, его площадь: " + circle1.getArea());
        } else {
            System.out.println("Больше прямоугольник, его площадь: " + rectangle1.getArea());
        }

        //Задание4 массив из пяти фигур
        GeometricObject[] figures = {
                triangle2,
                circle1,
                rectangle1,
                new Square(3),
                new Square(5)
        };

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Площадь фигуры " + (i + 1) + ": " + figures[i].getArea());

            if (figures[i] instanceof Colorable) {
                Colorable figure = (Colorable) figures[i];
                figure.howToColor();
            }
        }

        scanner.close();
    }

    //Для красоты вынес в отдельный метод - чтобы отработать кастомную ошибку отдельно и не оборачивать вообще ВСЕ в трай кетч
    public static Triangle createTriangle(double side1, double side2, double side3){
        try {
            Triangle triangle = new Triangle(side1, side2, side3, "Розовенький", true);
            System.out.println("Треугольник создан");
            return triangle;
        }
        catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Создан треугольник по умолчанию");
        return new Triangle();
    }
}