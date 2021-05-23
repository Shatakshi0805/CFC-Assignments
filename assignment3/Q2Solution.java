package com.company.assignment3;

import java.util.Scanner;


public class Q2Solution {
    public static void main(String[] args) {

        System.out.println("Enter size of array: ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
       }
        horizontalWave(arr, n);
    }

    private static void horizontalWave(int[][] arr, int n) {
        int i = 0;
        int j;
            for ( j = 0; j < n; j++) {
                System.out.print(arr[i][j] + ",");
            }
            i++;
            while(j > 0) {
                j--;
                System.out.print(arr[i][j] + ",");
            }
            i++;
            for ( j = 0; j < n; j++) {
                System.out.print(arr[i][j] + ",");
            }
            i++;
            while(j > 0) {
                j--;
                System.out.print(arr[i][j] + ",");
            }
        }
    }


