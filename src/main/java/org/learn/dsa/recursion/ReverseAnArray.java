package org.learn.dsa.recursion;

public class ReverseAnArray {
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5};

        reverseUsingTwoPointers(0, arr.length - 1, arr);
        for (int a: arr) {
            System.out.print(a + ", ");
        }

        arr = new int[]{1, 2, 3, 4, 5};
        reverseUsingOnePointer(0, arr.length, arr);

        for (int a: arr) {
            System.out.print(a + ", ");
        }
    }

    private static void reverseUsingOnePointer(int i, int n, int[] arr) {
        if(i >= arr.length/2) return;

        int temp = arr[i];
        arr[i] = arr[n - i -1];
        arr[n - i - 1] = temp;

        reverseUsingOnePointer(i+1, arr.length, arr);
    }

    private static void reverseUsingTwoPointers(int start, int end, int[] arr) {
        if(start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseUsingTwoPointers(start + 1, end -1, arr);
    }
}
