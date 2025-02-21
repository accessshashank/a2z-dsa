package org.learn.dsa.arrays;

import java.io.Console;
import java.lang.constant.Constable;

public class LongestSubArrayOfLengthK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        int k = 6;
        int maxLen = 0;
        int n = arr.length;
        int left = 0, right = 0;

        int sum = arr[0];

        while (right < n){

            while(left <= right && sum > k){
                sum = sum - arr[left];
                left++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if(right < n){
                sum = sum + arr[right];
            }


        }

        System.out.print(maxLen);
    }
}
