package com.company;

import java.util.Scanner;

class Overloading{
    public static void MethodOverloading(){
        System.out.println("Output of Method with no input");
        System.out.println("Good Morning");
    }
    public static void MethodOverloading(String a){
        System.out.println("Output of Method with one input");
        System.out.println(a);
    }
    public static void MethodOverloading(String a,String b){
        System.out.println("Output of Method with two input");
        System.out.println(a + " " + b);
    }
}
public class methodOverloading {
//    public static void reference(int [] arr){
//        System.out.println("Value is passed in array through reference");
//        for (int i:
//             arr) {
//            System.out.println(i);
//        }
//}
public static void main(String[] args) {
//        int [] marks= {23,24,25,26,27};
//        reference(marks);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first string");
    String a = scanner.nextLine();
    System.out.println("Enter the second string");
    String b = scanner.nextLine();
    Overloading.MethodOverloading();
    Overloading.MethodOverloading(a);
    Overloading.MethodOverloading(a, b);
}
}