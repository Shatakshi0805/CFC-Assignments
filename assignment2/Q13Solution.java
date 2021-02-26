package com.company.assignment2;

import java.util.Arrays;

public class Q13Solution {
    public static void main(String[] args) {
        int[] arr = {3,8,5,13,6,12,18,5};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int i = 0, j = (arr.length-1);
        while (j >= i) {
            int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
