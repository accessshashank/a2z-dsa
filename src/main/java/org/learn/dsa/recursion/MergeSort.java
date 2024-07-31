package org.learn.dsa.recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,4,3,2,1};
        Sort(arr,0,arr.length - 1);
        for (Integer item: arr) {
            System.out.print(item + ", ");
        }
    }

    private static void Sort(int[] arr, int low, int high) {

        if(low >= high) return;

        int mid = (low + high)/2;
        Sort(arr,low, mid);
        Sort(arr, mid+1, high);

        Merge(arr, low, mid, high);

    }

    private static void Merge(int[] arr, int low, int mid, int high) {
        int[] temp1 = new int[arr.length];

        int left = low;
        int right = mid+1;
        int k = 0;

        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                temp1[k] = arr[left];
                k++;
                left++;
            }
            else {
                temp1[k] = arr[right];
                k++;
                right++;
            }
        }

        while (left <= mid){
            temp1[k] = arr[left];
            k++;
            left++;
        }

        while (right <= high){
            temp1[k] = arr[right];
            k++;
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp1[i - low];
        }
    }
}
