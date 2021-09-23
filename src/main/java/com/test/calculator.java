package com.test;

import java.util.*;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] ch = input.toCharArray();
        String o1 = "";
        String o2 = "";
        int num1,num2,res=0;
        for (int i = 0; i < ch.length;i++) {
            if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
                for (int j = 0; j < i; j++)
                    o1 += Character.toString(ch[j]);
                for (int j = i + 1; j < ch.length; j++)
                    o2 += Character.toString(ch[j]);
                num1 = Integer.parseInt(o1);
                num2 = Integer.parseInt(o2);
                if (ch[i] == '+')
                    res = num1 + num2;
                if (ch[i] == '-')
                    res = num1 - num2;
                if (ch[i] == '*')
                    res = num1 * num2;
                if (ch[i] == '/')
                    res = num1 / num2;

            }
        }
        System.out.print(input + " = " + res);
    }
}
