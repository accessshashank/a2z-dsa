package org.learn.dsa.arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1};

        int counter = 0;
        int maxOnes = 0;

        for(int i=0; i < arr.length;i++){
            if(arr[i] == 1){
                counter++;
                if(counter > maxOnes){
                    maxOnes = counter;
                }
            }
            else {
                counter=0;
            }
        }

        System.out.print(maxOnes);
    }
}
