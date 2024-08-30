package org.learn.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5,8};
        int[] arr2 = {2,3,4,4,5,6,7};

        int i = 0;
        int j = 0;
        int lastElement = 0;

        List<Integer> union = new ArrayList<>();

        while(i <= arr1.length -1 && j <= arr2.length - 1){
            if(arr1[i] <= arr2[j] && arr1[i] != lastElement){
                union.add(arr1[i]);
                lastElement = arr1[i];
                i++;

            }
            else if(arr2[j] < arr1[i] && arr2[j] != lastElement){
                union.add(arr2[j]);
                lastElement = arr2[j];
                j++;

            }else if(arr1[i] == lastElement) {
                i++;
            } else if(arr2[j] == lastElement) {
                j++;
            }
        }

        while(i <= arr1.length - 1){
            if(arr1[i] != lastElement){
                union.add(arr1[i]);
                lastElement = arr1[i];
                i++;
            }
            else {
                i++;
            }
        }

        while(j <= arr2.length - 1){
            if(arr2[j] != lastElement){
                union.add(arr2[j]);
                lastElement = arr2[j];
                j++;
            }
            else {j++;}
        }

        for(int x = 0; x <= union.size()-1; x++){
            System.out.print(union.get(x) + ",");
        }
    }
}
