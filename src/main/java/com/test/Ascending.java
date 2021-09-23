package com.test;

public class Ascending {
    void print(int [] aa){
        for(int i:aa)
            System.out.print(i+" ");
        System.out.println();
    }
    void ascen(int [] aa){
        int temp;
        for(int i=0;i< aa.length-1;i++) {
            for(int j=0;j< aa.length-i-1;j++) {
                if(aa[j]>aa[j+1]) {
                    temp = aa[j];
                    aa[j] = aa[j+1];
                    aa[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int aa[]={22,44,11,00,55,99,77,33,88,66};
        Ascending obj=new Ascending();
        System.out.println("Before Ascending the array ");
        obj.print(aa);
        System.out.println("After Ascending the array ");
        obj.ascen(aa);
        obj.print(aa);
    }
}
