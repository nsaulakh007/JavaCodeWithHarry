package com.company;
class Hello {
    private static int y = 4;
    public static void name() {
        System.out.println("Calling static variable " + y);
    }

    static class Test {
        static public void out() {
            System.out.println("Calling static class");
        }
    }
}
public class staticKeyword {
    public static void main(String[]args){
        Hello.Test.out();
        Hello.name();
    }

}
