package com.company;

import java.util.Scanner;

class SwapUsingTwoVariable{
    public static void swap1(int a,int b){
        a = a+b;
        b=a-b;
        a= a-b;
        System.out.println("Number swap using two variable");
        System.out.println("First number after swapping is: " + a);
        System.out.println("Second number after swapping is: " + b);
    }
        }
        class SwapUsingThreeVariable{
    public static void swap2(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Number swap using three variable");
        System.out.println("First number after swapping is: " + a);
        System.out.println("Second number after swapping is: " + b);
    }
        }
public class swap {
    public static void main(String []args){
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        SwapUsingTwoVariable.swap1(a,b);
        SwapUsingThreeVariable.swap2(a,b);
    }
}
