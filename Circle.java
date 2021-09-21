package com;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int r=in.nextInt();//Input from user
        System.out.println("Area of Circle is "+Math.PI*r*r);
    }
}
