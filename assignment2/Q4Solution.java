package com.company.assignment2;

import java.util.Scanner;

public class Q4Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = reverse(n);
        System.out.println(result);
    }

    private static int reverse(int n) {
        int rem, res = 0;
        while(n > 0) {
            rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        return res;
    }
}
