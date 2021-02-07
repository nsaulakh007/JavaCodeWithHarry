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
class Recursion{
    public static void recursion(int num,int srange, int erange){
        if(srange == (erange+1)){
            System.out.println("Starting and end range are now same");
        }else {
            int ans = num * srange;
            System.out.println(num + "x" + srange +  "=" + ans);
            srange = srange + 1;
            recursion(num,srange,erange);
        }
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
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter the first string");
//    String a = scanner.nextLine();
//    System.out.println("Enter the second string");
//    String b = scanner.nextLine();
//    Overloading.MethodOverloading();
//    Overloading.MethodOverloading(a);
//    Overloading.MethodOverloading(a, b);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of which you want to display the table");
    int num = scanner.nextInt();
    System.out.println("Enter the starting range");
    int srange = scanner.nextInt();
    System.out.println("Enter the end range");
    int erange = scanner.nextInt();
    Recursion.recursion(num,srange,erange);
}
}