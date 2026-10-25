package com.fintech.practice4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца от 1 до 12: ");

        //Просто вся логика в try catch оборачивается
        try {
            int index = scanner.nextInt() - 1;
            //System.out.println(months[index] + ": " + days[index] + " дней"); - в первом задании здесь стоит, во втором в условии в елсе - если выбран не февраль (февраль отдельно условием обрабатывается)

            //Для второго задания
            if (index == 1) {
                System.out.print("Введите год: ");
                int year = scanner.nextInt();

                if (visokosniiYear(year)) {
                    days[index] = 29;
                    System.out.println("Год: " + year + " високосный, поэтому в феврале 29 дней");
                } else {
                    System.out.println("Год: " + year + " не високосный, поэтому в феврале 28 дней");
                }
            } else {
                System.out.println(months[index] + ": " + days[index] + " дней");
            }
            //

        //Т.к. ошибки не кастомные - отдельный класс реализации не нужен - message прям тут можно задать
        //Ошибка выхода за границы индекса - проверка(0-11) месяцев
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        //Ошибка типа (ждет что то что можно переварит как int - иначе бан
        } catch (InputMismatchException e) {
            System.out.println("Вообще не число число");
        }

        scanner.close();
    }

    //Отдельный метод по условию
    private static boolean visokosniiYear(int year){
        //Как то это по григореанскому календарю считается - делением на 4, 100 и 400 крч формула такая
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}