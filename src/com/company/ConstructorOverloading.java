package com.company;

public class ConstructorOverloading {
    ConstructorOverloading(String a){
        System.out.println("The output constructor with one parameter is: " + a);
    }
    ConstructorOverloading(String a, String b){
        System.out.println("The output of constructor with two parameter is:" + a + "  " + b);
    }
    public void display(){
        System.out.println("calling function through object");
    }
    public static void main(String[] args){
        String a ="Navjot";
        String b = "Singh";
        ConstructorOverloading a1 = new ConstructorOverloading(a);
        ConstructorOverloading a2 = new ConstructorOverloading(a,b);
        a1.display();
    }
}
