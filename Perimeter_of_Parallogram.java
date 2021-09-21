package com;

import java.util.Scanner;

public class Perimeter_of_Parallogram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float base=in.nextFloat();
        float height=in.nextFloat();
        float c=2*(base*height);
      System.out.println("Perimeter of parallogram is "+ c) ;
    }
}
