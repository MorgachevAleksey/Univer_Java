package com.fintech.practice4.task1;

//Вообще это уже смешно - класс circle (материнский для этого) (как и все другие фигуры) уже наследует comparable, поэтому ничего нового этот класс не делает, но нужен по ТЗ
public class ComparableCircle extends Circle implements Comparable{
    public ComparableCircle(double radius){
        super(radius);
    }

    //compareTo переопределять не надо потому что он уже через circle из geomitric object наследуется
}