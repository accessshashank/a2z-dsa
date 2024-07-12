package org.learn.dsa.recursion;

public class Factorial {
    public static void main(String[] args){
        int n = 5;
        factAsParameterized(n, 1);
        System.out.println(factAsReturnValue(n));
    }

    private static void factAsParameterized(int n, int product) {
        if(n == 0) {
            System.out.println(product);
            return;
        }

        factAsParameterized(n-1, n*product);
    }

    private static int factAsReturnValue(int n){
        if(n == 0){
            return 1;
        }

        return n*factAsReturnValue(n-1);
    }
}
