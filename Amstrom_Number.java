package com;

public class Amstrom_Number {
    public static void main(String[] args) {
        int a=15;
        int sum=0;
        while(a>0){
            int rem=a%10;  // it will give remainder
            int cube=rem*rem*rem; // what remainder we will get we will cube it
            sum=sum+cube; // suming what cube we got above intial sum is 0 then as loop goes values will be increasing
            
            a=a/10; //it will remove last value as what we got remainder value
        }
        System.out.println(sum);
    }
}
