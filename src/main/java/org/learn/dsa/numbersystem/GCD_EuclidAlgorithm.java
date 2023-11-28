package org.learn.dsa.numbersystem;

public class GCD_EuclidAlgorithm {
    public static void main(String[] args){
        // gcd(a,b) = gcd(a%b,b) when a > b

        int a = 52;
        int b = 12;

        while(a > 0 && b > 0){
            if(a>b) a = a%b;
            else b = b%a;
        }

        if(a == 0) System.out.println(b);
        System.out.println(a);
    }
}
