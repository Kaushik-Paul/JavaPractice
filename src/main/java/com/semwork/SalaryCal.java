package com.semwork;

interface Salary {
    double da = 0.5;
    double hra = 0.2;
    double medical = 0.2;

    void calculate(double basic, int inc);

}

class AssocProf implements Salary {
    public void calculate(double basic, int inc) {
        basic += inc * 400;
        double totsal = basic + basic * da + basic * hra + basic * medical;
        System.out.println("Total Salary of Associate Professor =" + totsal);
    }}




class AssisProf implements Salary {
    public void calculate(double basic, int inc) {
        basic += inc * 775;
        double totsal = basic + basic * da + basic * hra + basic * medical;
        System.out.println("Total Salary of Assistant Professor  =" + totsal);
    }
}

class Prof implements Salary {
    public void calculate(double basic, int inc) {
        basic += inc * 1200;
        double totsal = basic + basic * da + basic * hra + basic * medical;
        System.out.println("Total Salary of Professor =" + totsal);
    }
}
public class SalaryCal {
    public static void main(String[] args) {
        new AssocProf().calculate(12000, 3);
        new AssocProf().calculate(22000, 3);
        new Prof().calculate(40000, 3);
    }
}
