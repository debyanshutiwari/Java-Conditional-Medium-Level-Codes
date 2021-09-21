package com;

import java.util.Scanner;

public class Occurance_of_number_counting {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt(); // number from user
        int a=0;
        while(n>0){
            int rem=n%10; // it will give last digit
            if(rem==3){
                a++; // initial count is 0.if rem=3 then it will be count 1 then again if it found one more rem=3 then it will increase 2 so on....


            }
            n=n/10;  // it will remove last digit
        }
        System.out.println(a);
    }
}
