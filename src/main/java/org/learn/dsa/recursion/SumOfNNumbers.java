package org.learn.dsa.recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 5;
        sumAsParameterized(n, 0);
        System.out.println(sumAsReturnValue(n));
    }

    private static void sumAsParameterized(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }

        sumAsParameterized(i-1, sum+i);
    }

    private static int sumAsReturnValue(int n){
        if(n == 0){
            return 0;
        }

        return n + sumAsReturnValue(n-1);
    }
}
