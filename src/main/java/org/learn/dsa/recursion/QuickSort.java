package org.learn.dsa.recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= new int[]{5,4,3,2,1};
        qs(arr,0,arr.length-1);
        for (Integer item: arr) {
            System.out.print(item + ", ");
        }
    }

    private static void qs(int[] arr, int low, int high) {
        if(low < high){
            int partitionIndex = partition(arr, low, high);
            qs(arr, low, partitionIndex - 1);
            qs(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int partition = arr[low];
        while (i < j){
            while (arr[i] <= arr[low] && i <= high - 1){
                i++;
            }

            while (arr[j] > arr[low] && j >= low+1){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }


        int temp1 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp1;

        return j;
    }
}
