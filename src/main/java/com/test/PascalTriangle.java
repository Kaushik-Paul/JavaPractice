package com.test;

public class PascalTriangle {

    public void pascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // This loop is used for spaces
            for (int j = n; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i,j) + " ");
            }
            System.out.println();
        }
    }

    private int combination(int n, int r) {
        if (n == 0 && r == 0) {
            return 1;
        }
        int sum = factorial(n) / (factorial(r) * factorial(n - r));
        return sum;
    }

    private int factorial(int n) {
        int sum = 1;
        for (int i = n; i >= 1; i--) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.pascalTriangle(5);

    }

}
