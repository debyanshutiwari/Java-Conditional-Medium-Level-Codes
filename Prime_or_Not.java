package com;

import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        for (int i =1 ; i <a ; i++) {
            if(a%2==0){
                System.out.println("not prime ");
                break;
            }
            else{
                System.out.println("prime");
                break;
            }

        }
    }
}