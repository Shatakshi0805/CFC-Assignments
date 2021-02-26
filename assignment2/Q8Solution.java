package com.company.assignment2;


import java.util.Arrays;
import java.util.Scanner;

public class Q8Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(divByFive(arr));
    }

    private static int divByFive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

}
