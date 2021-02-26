package com.company.assignment2;

import java.util.Scanner;

public class Q6Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int res = gcd(a, b);
        System.out.println(res);
    }

    private static int gcd(int a, int b) {
        int small, ans = 0;
        if (a > b) {
            small = b;
        } else {
            small = a;
        }
        for (int i = 1; i <= small; i++) {
            if (a%i == 0 && b%i == 0) {
                 ans = i;
            }
        }
        return ans;
    }
}
