package org.learn.dsa.numbersystem;

public class LargestDigitInANumber {
    public static void main(String[] args) {
        int num = 5634;
        int largest = 0;

        while(num > 0){
            int rem = num % 10;

            largest = Math.max(largest, rem);
            num = num / 10;
        }

        System.out.print(largest);
    }
}
