package org.learn.dsa.recursion;

public class Palindrome {
    public static void main(String[] arg){
        String str = "MADAM";

        System.out.print(isPalindrome(str, 0));

        str = "MADSM";

        System.out.print(isPalindrome(str, 0));
    }

    private static boolean isPalindrome(String s, int i){
        if(i >= (s.length() - 1)/2) return true;

        if(s.charAt(i) != s.charAt(s.length() - i - 1)){
            return false;
        }

        return isPalindrome(s, i+1);
    }
}
