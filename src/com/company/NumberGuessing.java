package com.company;

import java.util.Scanner;

public class NumberGuessing {

    public static void main(String []args){
        int rand = (int) (1+(100-1)*Math.random());
        System.out.println("Enter the number between 1 to 100");
        Scanner scanner = new Scanner(System.in);
        int i=1;
        int number;
        do{
            number = scanner.nextInt();
            if(rand==number){
            System.out.println("you win in round: " + i);
        }else if(rand < number){
                System.out.println("Enter smaller number");

            }
            else if(rand > number){
                System.out.println("Enter larger number");

            }
            i=i+1;
        }while(rand != number);
    }
}
