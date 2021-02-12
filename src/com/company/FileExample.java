package com.company;

import java.io.*;

public class FileExample {
    public static void main(String[]args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("./File1.txt");
        String s= "Hello World";
        char ch[]=s.toCharArray();
        for (int i=0;i<s.length();i++){
            fileOutputStream.write(ch[i]);
        }
        fileOutputStream.close();
        FileWriter fileWriter = new FileWriter("./File1.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(" Text entered through buffer writer");
        bufferedWriter.close();
        FileInputStream fileInputStream = new FileInputStream("./File1.txt");
        int i;
        do {
            i=fileInputStream.read();
            if(i!=-1){
                System.out.print((char) i);
            }
        }while(i!=-1);
        System.out.println("");
        System.out.println("File reading through buffer reader");
        int cha;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./File1.txt"));
        while ((cha=bufferedReader.read())!=-1){
            System.out.print((char) cha);
        }
        bufferedReader.close();
    }
}
