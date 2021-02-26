package com.company.assignment2;

import java.util.Scanner;

public class Q10Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {8, 2, 1, 0};

        isSorted(nums);
    }

    private static void isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                System.out.println("sorted");

            }
        }
        System.out.println("unsorted");
        }
}


