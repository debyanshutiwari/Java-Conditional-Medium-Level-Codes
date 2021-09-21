package com;

import java.util.Scanner;

    public class Triangle{
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            int base =in.nextInt();//Input from user
            int height=in.nextInt();//from user
            int c=(height*base)/2; //It will combine all base and height
            System.out.println(c);
        }
    }

