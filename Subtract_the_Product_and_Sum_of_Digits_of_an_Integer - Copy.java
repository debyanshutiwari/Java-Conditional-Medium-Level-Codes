package com;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        int a=234;
        int sum=0;
        int product=1;   //
        while(a>0){
            int rem=a%10;//234 remainder is 4 //23 remainder will be 3 //remainder is 2 //nothing is left so zero

            sum=sum+rem;//output 4// output 7//9

            product=product*rem;//4//output 12//24
            
            a=a/10; //it will remove 4//it wii remove 3// it will remove 2
        }
        System.out.println(product-sum);   //24-9=25
    }
}
