package org.learn.dsa.arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 2,2,2,3,3};
        int i = 0;
        int j = 1;

        while(j <= arr.length - 1){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
            j++;
        }

        for(int x = 0; x <= i; x++){
            System.out.print(arr[x] + ",");
        }
    }
}
