package com;

import java.util.Scanner;

public class Area_OF_Rhombus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float diagonal1=in.nextFloat();
        float diagonal2=in.nextFloat();
        System.out.println("Area OF Rhombus is "+diagonal1*diagonal2);
    }
}
