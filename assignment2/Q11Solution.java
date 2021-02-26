package com.company.assignment2;


import java.util.Arrays;

public class Q11Solution {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 1, 0, 0};
        sortOnesZeros(arr);

    }

    private static void sortOnesZeros(int[] arr) {
        int i, ind = 0;                               // here we have created a pointer type variable ind which maintains the value of arr index
        for (i = 0; i < arr.length; i++) {     // everytime it encounters a zero it will swap zero with the value being pointed by ind variable
            if (arr[i] == 0) {                 // then after i increase the value of ind to store next encountered zero on that position
                swap(arr, i, ind);
                ind++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int ind) {
        int temp = arr[ind];
        arr[ind] = arr[i];
        arr[i] = temp;
    }
}
