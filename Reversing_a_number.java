package com;

public class Reversing_a_number {
    public static void main(String[] args) {
        int a=123456;
        int ans=0;
        while(a>0){
            int rem=a%10;
            a=a/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
