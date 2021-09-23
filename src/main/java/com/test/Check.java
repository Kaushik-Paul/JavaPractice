package com.test;
interface Woo{
    void run();
}
public class Check implements Woo {
    public void run(){
        System.out.println("Interface is running");
    }
    public static void main(String[] args) {
        System.out.print(128>>1);
        Check obj=new Check();
        obj.run();
        for(int i=0;i<10;i++)
            System.out.println("Hello");
        for (int k = 0; k < 80; k++) {
            System.out.println();
        }
    }
}

