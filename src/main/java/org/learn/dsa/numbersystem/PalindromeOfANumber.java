package org.learn.dsa.numbersystem;


public class PalindromeOfANumber {
    public static void main(String[] args) {
        Integer n = 7887;
        Integer copyN = n;
        Integer reverseNum = 0;

        while (n > 0) {
            int lastDigit = n%10;
            n = n/10;
            reverseNum = (reverseNum*10) + lastDigit;
        }

        if(copyN.equals(reverseNum)) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
