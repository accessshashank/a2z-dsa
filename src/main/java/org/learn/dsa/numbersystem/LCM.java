package org.learn.dsa.numbersystem;

public class LCM {
    public static void main(String[] args){
        //Note also : LCM = (n1*n2/gcd(n1,n2));
        int n1 = 3, n2 = 5;
        int max = Math.max(3,5);
        int i = 1;
        int lcm = 1;
        do{
            lcm = i * max;
            if(lcm % n1 == 0 && lcm % n2 == 0){
                break;
            }
            i++;
        } while(true);

        System.out.print(lcm);
    }
}
