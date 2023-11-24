package org.learn.dsa.numbersystem;

public class ReverseOfANumber {
    public static void main(String[] args) {
        int n = 7768;
        int reverseNum = 0;
        int copyN = n;

        while(n > 0)
        {
            int lastDigit = n%10;
            n = n/10;
            reverseNum = reverseNum*10 + lastDigit;
        }

        System.out.println("Reverse number of "+ copyN + " is " + reverseNum );
    }
}
