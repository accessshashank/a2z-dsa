package org.learn.dsa.arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int temp = arr[0];

        for(int i = 1; i< arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        for(int x = 0; x <= arr.length - 1; x++){
            System.out.print(arr[x] + ",");
        }
    }
}
