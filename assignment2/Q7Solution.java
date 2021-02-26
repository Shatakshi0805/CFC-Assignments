package com.company.assignment2;

import java.util.Scanner;

public class Q7Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int res = lcm(a, b);
        System.out.println(res);
    }

    private static int lcm(int a, int b) {
        int great,small, j, ans = 0;
        if (a > b) {
            great = a;
            small = b;
        } else {
            great = b;
            small = a;
        }
        for (j = 1; j <= small; j++) {
            if ((great*j) % small == 0) {
                 ans = (great*j);
                 break;
            }
        }
        return ans;
    }
}
