package com.company.assignment2;


import java.util.Arrays;

public class Q12Solution {
    public static void main(String[] args) {
        int[] nums = {3,8,5,13,6,12,18,5};
        sortEvensOdds(nums);
    }

    private static void sortEvensOdds(int[] nums) {
        int i, ind = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                swap(nums, i, ind);
                ind++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int i, int ind) {
        int c = nums[ind];
        nums[ind] = nums[i];
        nums[i] = c;
    }
}
