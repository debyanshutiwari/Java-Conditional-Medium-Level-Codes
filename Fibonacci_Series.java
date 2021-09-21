package com;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();  // taking n from user...
        int a=0;
        int b=1;
        int c=2;
        while(c<=n){
            int temp=b;
            b=b+a;
            a=temp;
            c++;
        }
    }
}

