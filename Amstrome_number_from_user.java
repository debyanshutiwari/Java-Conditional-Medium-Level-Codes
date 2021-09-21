package com.debyanshu;

import java.util.Scanner;

public class Amstrome_number_from_user {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;

        while(n>0){
            int remainder=n%10;
            int cube=remainder*remainder*remainder;
            sum=sum+cube;
            n=n/10;

        }
        System.out.println(sum);
    }
}
