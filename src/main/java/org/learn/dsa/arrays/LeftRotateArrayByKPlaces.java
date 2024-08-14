package org.learn.dsa.arrays;

public class LeftRotateArrayByKPlaces {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int k = 7;
        k = k % arr.length;

        int[] arr1 = new int[k];

        for(int i =0; i<k; i++){
            arr1[i] = arr[i];
        }

        for(int i = k; i < arr.length;i++){
            arr[i - k] = arr[i];
        }

        int j = 0;
        for(int i = arr.length - k; i < arr.length; i++){
            arr[i] = arr1[j];
            j++;
        }

        for(int x = 0; x <= arr.length - 1; x++){
            System.out.print(arr[x] + ",");
        }
    }
}
