package com.test;


interface Rename {
    public abstract void run();
}

// Class B is defined which implements A and an empty implementation of run()
class Rename2 implements Rename {
    public void run() {}
}

// Class MyThread is defined which extends class B
class MyThread implements Rename {
    // run() is overriden and 'NPTEL Java' is printed.
    public void run() {
        System.out.print("NPTEL Java");
    }
}

// Main class Question is defined
public class ThreadTest {
    public static void main(String[] args) {
        // An object of MyThread class is created
        MyThread t = new MyThread();
        // run() of class MyThread is called
        t.run();
    }
}

