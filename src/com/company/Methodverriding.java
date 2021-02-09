package com.company;
class Car{
    void changeGear(){
        System.out.println("Car class method call");
    }
}
class SportsCar extends Car{
    void change(){
        super.changeGear();
    }
    void changeGear(){

        System.out.println("SportsCar class method call");
    }
}

public class Methodverriding extends SportsCar {
    public static void main(String[] args){
        Car g1 = new Car();
        SportsCar g2 = new SportsCar();
        g1.changeGear();
        g2.change();
        g2.changeGear();
    }
}