package org.learn.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,4,5,6,6};
        int[] b = {2,3,3,5,6,6,6};

        int i = 0;
        int j = 0;

        List<Integer> intersecion = new ArrayList<>();

        while(i <= a.length - 1 && j <= b.length - 1){
            if(a[i] == b[j]){
                intersecion.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            } else {
                j++;
            }
        }

        for(int x = 0; x <= intersecion.size()-1; x++){
            System.out.print(intersecion.get(x) + ",");
        }
    }
}
