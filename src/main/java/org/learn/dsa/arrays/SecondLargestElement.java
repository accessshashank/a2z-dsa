package org.learn.dsa.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,7,7,5};

        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for(int i =1; i<=arr.length - 1; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            } else if(arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }

        System.out.println(slargest);
    }
}
