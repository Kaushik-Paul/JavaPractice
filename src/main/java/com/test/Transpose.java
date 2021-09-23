package com.test;

public class Transpose {
    void print(int[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void trans(int[][] arr,int row,int col){
        int[][] trr=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
              trr[i][j]=arr[j][i];
            }
        }
        print(trr,col,row);
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        Transpose obj=new Transpose();
        System.out.println("Original array");
        int row=arr.length;
        int col=arr[0].length;
        obj.print(arr,row,col);
        System.out.println("Array after Transpose");
        obj.trans(arr,row,col);
    }
}
