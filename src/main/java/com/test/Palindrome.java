package com.test;

public class Palindrome {
    int num;
    Palindrome(int n){
        num=n;
    }
    boolean checkPalindrome(){
        int n=num,temp,sum=0;
        while(n>0){
            temp=n%10;
            n=n/10;
            sum=(sum*10)+temp;
        }
        if(sum==num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Palindrome obj=new Palindrome(12321);
        boolean check=obj.checkPalindrome();
        if(check==true)
            System.out.println("12321 is Palindrome");
        else
            System.out.println("12321 is not a Palindrome");
    }

}
