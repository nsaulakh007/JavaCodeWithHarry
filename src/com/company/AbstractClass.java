package com.company;
abstract class Person{
   public void detail(){
       System.out.println("calling detail function");
   }
   abstract public void detail1();
}
class Student extends Person {
    public void detail1(){
        System.out.println("calling detail1 function");
    }
}
public class AbstractClass {
    public static void main(String[]args){
        Student obj = new Student();
         obj.detail1();
         obj.detail();
    }
}
