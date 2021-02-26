package com.company.assignment2;

import java.util.Scanner;

public class DecToOct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int finalNum = decToOct(num);
        System.out.println(finalNum);
    }

    private static int decToOct(int num) {
        int rem, res = 0;
        while(num > 0) {
            rem = num % 8;
            num = num / 8;
            res = res*10 + rem;
        }
        int oct = reverse(res);
        return oct;
    }

    private static int reverse(int res) {
        int r, result = 0;
        while(res > 0) {
            r = res % 10;
            result = result*10 + r;
            res = res / 10;
        }
        return result;
    }
}
