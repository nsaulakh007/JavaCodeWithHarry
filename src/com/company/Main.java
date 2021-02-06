package com.company;

import java.util.Scanner;
class Navjot{
    public static void calculator(){
        System.out.println("Enter first number");
        Scanner cal = new Scanner(System.in);
        float a = cal.nextFloat();
        System.out.println("Enter 1 for Add 2 for Subtract 3 for Multiply 4 for Divide 5 for Reminder");
        int sign = cal.nextInt();
        System.out.println("Enter second number");
        float b = cal.nextInt();

        switch (sign) {
            case 1:
                sum(a,b);
                break;
            case 2:
                subtract(a, b);
                break;
            case 3:
                multiply(a, b);
                break;
            case 4:
                divide(a, b);
                break;
            case 5:
                modulous(a, b);
                break;
            default:
                System.out.println("Invalid operator selection");

        }
    }
    public static void sum(float a,float b){
          float c=a+b;
        System.out.print("The addition of two number is ");
        System.out.println(c);
    }
    public static void subtract(float a,float b){
        float c= a-b;
        System.out.print("The subtraction of two number is ");
        System.out.println(c);
    }
    public static void multiply(float a,float b){
        float c= a*b;
        System.out.print("The multiplication of two number is ");
        System.out.println(c);
    }
    public static void divide(float a,float b){
        float c= a/b;
        System.out.print("The divide of two number is ");
        System.out.println(c);
    }
    public static void modulous(float a,float b){
        float c= a%b;
        System.out.print("The modulous of two number is ");
        System.out.println(c);
    }
}
class MulTable{
    public static void invokeTable(){
        System.out.println("Enter the number to print the multiplication table");
        Scanner mul = new Scanner(System.in);
        int num = mul.nextInt();
        System.out.println("Enter the range till where you want to print the table");
        int range = mul.nextInt();
        table(num,range);
    }
   public static  void table(int num, int range){
        int sol=0;
        int i = 1;
        while(i<(range+1)){
            int ans= i * num;
            System.out.println(num + "x" + i + "=" + ans);
            i++;
        }

    }
}
class Game{
    public static void invokeGame(){
        double rand = 1+(150-1)*Math.random();
        System.out.println(rand);
        char comp = 'S';
        if(rand<50){
            comp = 'S';
        }else if(rand > 50 && rand < 100){
            comp = 'C';
        }else if(rand > 100 && rand <150){
            comp = 'P';
        }
        System.out.println("Enter S for stone,C for ceaser, P for paper");
        Scanner game = new Scanner(System.in);
        char user;
            user = game.next().charAt(0);
            System.out.println(user);
//            ***************************************
//        if(comp == user){
//            System.out.println("The match tie");
//        }else if(comp=='S' && user == 'C'){
//            System.out.println("You Lose");
//        }
//          else if(comp=='S' && user == 'P'){
//              System.out.println("You Win");
//        }else if(comp=='P' && user == 'C'){
//            System.out.println("You Win");
//        }else if(comp=='P' && user == 'S'){
//            System.out.println("You Lose");
//        }else if(comp=='C' && user == 'P'){
//            System.out.println("You Lose");
//        }else if(comp=='C' && user == 'S'){
//            System.out.println("You Win");
//        }else {
//            System.out.println("Invalid Input");
//        }
//        **********************************************************************
        if(comp == user){
            System.out.println("The match tie");
        }else if((comp=='S' && user == 'C')||(comp=='C' && user == 'P')||(comp=='P' && user == 'S')){
            System.out.println("You Lose");
        }
          else if((comp=='S' && user == 'P')||(comp=='P' && user == 'C')||(comp=='C' && user == 'S')){
              System.out.println("You Win");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Press G for game, C for calculator, M for multiplication table");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if(choice == 'G'){
            Game.invokeGame();
        }else if(choice == 'C'){
         Navjot.calculator();
        }else if(choice == 'M'){
            MulTable.invokeTable();
        }else {
            System.out.println("Invalid Input");
        }
     }
}
