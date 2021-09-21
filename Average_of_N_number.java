package com.debyanshu;

import java.util.Scanner;

public class Average_of_N_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int d=0;
        for (int i = 0; i <=n ; i++) {
            sum=sum+i;
            d=sum/n;
//

        }
        System.out.println(d);
    }
}
