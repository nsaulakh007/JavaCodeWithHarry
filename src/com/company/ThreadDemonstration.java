package com.company;
class first implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Class first iteration " + i);
        }
    }
}
class second implements Runnable{

    @Override
    public void run() {
        for(int j=0;j<10;j++){
            System.out.println("Class second iteration " + j);
        }
    }
}
class third implements Runnable{
    @Override
    public void run() {
        for (int k=0;k<10;k++){
            System.out.println("Class third iteration "+k);
        }
    }
}
public class ThreadDemonstration {
    public static void main(String[]args){
        Thread t1= new Thread(new first());
        Thread t2 = new Thread(new second());
        Thread t3 = new Thread(new third());
        t1.start();
        t2.start();
        t3.start();
    }

}
