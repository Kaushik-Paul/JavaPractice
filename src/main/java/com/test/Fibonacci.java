package com.test;

public class Fibonacci {
    int count;
    Fibonacci(int n){
        count=n;
    }
    void printFibo(){
        int a=0,b=1,c;
        if(count==1) {
            System.out.print("0");
            return;
        }
        while(count>0){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            count--;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci(10);
        System.out.println("Fibonacci for 10 nos are ");
        obj.printFibo();
    }
}
