package com;

import java.util.Scanner;

public class AreaofIsoceles {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int base =in.nextInt();//Input from user4

        int height=in.nextInt();//from user
        System.out.println("Area of Rectangle is "+(base*height)/2);
    }
}
