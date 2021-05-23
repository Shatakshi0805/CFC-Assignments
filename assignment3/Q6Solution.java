package com.company.assignment3;

import java.util.Scanner;

public class Q6Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[m];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        int k = n > m ? n : m;
        int[] b = new int[k+1];
        int sum = 0, ans, carry = 0;
        int i = n-1;
        while (i >= 0) {
             sum = a1[i] + a2[i];
             ans = sum%10;
             carry = sum/10;
            b[i+1] = ans;
         //   i--;
            a1[i-1] = a1[i-1] + carry;
        }
        b[i+1] = carry;

        for (int j = 0; j < k; j++) {
            System.out.println(b[i] + " ");
        }
    }


}
