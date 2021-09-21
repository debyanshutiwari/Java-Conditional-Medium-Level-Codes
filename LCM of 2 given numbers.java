//LCM OF TWO Number
package com.debyanshu;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=1;
        for (int i = 1; i <=a && i<=b; i++) {
            if(a%i==0 && b%i==0){
                sum=i;
            }

          int lcm=(a*b)/sum;
            System.out.println(lcm);
            break;

        }
    }
}
