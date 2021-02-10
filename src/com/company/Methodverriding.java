package com.company;
class Car{
    int i=4;
    public Car(int x){
        System.out.println("Calling Car class constructor and passing value using super keyword " + x);
    }
    void changeGear(){
        int i=4;
        System.out.println("Car class method call");
    }
}
class SportsCar extends Car{
    public SportsCar(){
        super(4);
        System.out.println("Sports car constructor called");
    }
    int i=7;
    void change(){
        super.changeGear();
        System.out.println("This use explained using variable i: " + i);
    }
    void changeGear(){
        this.i=3;

        System.out.println("SportsCar class method call");
        System.out.println("super class variable fetch before changing: " + super.i);
        super.i = 5;
        System.out.println("super class variable fetch after changing: " + super.i);
    }
}

public class Methodverriding extends SportsCar {
    public static void main(String[] args){
        Car g1 = new Car(3);
        SportsCar g2 = new SportsCar();
        g1.changeGear();
        g2.change();
        g2.changeGear();
        g2.change();
    }
}