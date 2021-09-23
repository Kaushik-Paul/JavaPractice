package com.test;

public class Multiplication {
    void print(int[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void mult(int [][]aa,int [][]bb,int row,int col){
        int[][] cc = new int[row][col];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                cc[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    cc[i][j] += aa[i][k] * bb[k][j];
                }
            }
        }
        print(cc, row, col);
    }

    public static void main(String[] args) {
        Multiplication obj=new Multiplication();
        int aa[][]={{1,1,1},{2,2,2},{3,3,3}};
        int bb[][]={{4,4,4},{5,5,5},{6,6,6}};
        int row=aa.length;
        int col=aa[0].length;
        System.out.println("Matrix A");
        obj.print(aa,row,col);
        System.out.println("Matrix B");
        obj.print(aa,row,col);
        System.out.println("After the Multiplication");
        obj.mult(aa,bb,row,col);
    }
}
