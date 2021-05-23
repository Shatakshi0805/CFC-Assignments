package com.company.assignment3;

import java.util.Arrays;

public class Q8Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 2, 4, 1};
        int[] nums2 = {2, 1, 3, 1, 5, 2, 2};
        intersection(nums1, nums2);
    }

    private static void intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int k = 0;
        for (int i = 0; i < nums1.length/2; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    arr[k] = nums1[i];
                    k++;
               }
//                if(i >= nums1.length || j >= nums2.length) {
//                    break;
//                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
