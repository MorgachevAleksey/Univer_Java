package com.fintech.practice3.task1.vehicles;

public class Car extends Vehicle{
    //Прописать пустой конструктор - при наличии другого конструктора хороший тон потому что:
    //Если явно задан один конструктор и больше - конструктор по умолчанию исчезает и вернуть его можно прописав явно
    public Car(){
        super(); //Даже в пустом конструкторе обязательно вызвать конструктор материнского класса (пусть и тоже пустой)
    }
    //Если в конструктор передается 4 аргумента и больше - то по хорошему нужно использовать Builder (но здесь используется стандартный конструктор с вызовом конструктора материнского класса)
    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber){
        super(model, license, color, year, ownerName, insuranceNumber);
        //Сеттером в конструкторе - так можно делать
        //(второй вариант: как в предыдущей практике задать поле материнского класса protected и здесь присвоить значение напрямую)
        setEngineType("Combustion");
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
