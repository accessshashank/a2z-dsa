package org.learn.dsa.arrays;

public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 7, 4, 0, 9, 0, 6};

        int i = 0;
        int j = 1;

        int k = 0;
        while(k <= arr.length - 1 && arr[k] != 0){
            k++;
        }

        i = k;
        j = k+1;

        while(j <= arr.length - 1){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
                i++;
                j++;
            }
            else {
                j++;
            }
        }

        for(int x = 0; x <= arr.length - 1; x++){
            System.out.print(arr[x] + ",");
        }
    }
}
