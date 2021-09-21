package com;

import java.util.Scanner;

public class Area_of_EquilaterTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float side=in.nextFloat();
        System.out.println("Area of Equilateral triangle is "+((1.72)/4)*side*side);
    }
}
