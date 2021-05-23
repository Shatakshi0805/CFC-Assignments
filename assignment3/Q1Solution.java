package com.company.assignment3;

import java.util.Scanner;

public class Q1Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
                {41,42,43,44}};
        verticalWave(nums, 0, 0);

        }

    private static void verticalWave(int[][] nums, int crow, int ccol) {
         for (int i = crow; i < nums.length; i++) {
             System.out.print(nums[i][ccol] + " ");
         }
         ccol++;                                           // ccol = 1
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i][ccol] + " ");
        }
        ccol++;                                             // ccol = 2
        for (int i = crow; i < nums.length; i++) {
            System.out.print(nums[i][ccol] + " ");
        }
        ccol++;                                            // ccol = 3
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i][ccol] + " ");
        }

    }
}

