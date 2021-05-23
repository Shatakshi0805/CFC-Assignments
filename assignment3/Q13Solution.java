package com.company.assignment3;

import java.util.Scanner;

public class Q13Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        perfectSubstring(s, k);
    }

    private static void perfectSubstring(String s, int k) {
        int change = 0, count = 0;
        StringBuilder sb = new StringBuilder(s);
        int i;
        for (i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) != sb.charAt(i-1)) {
                if (change == k) { //imp!!!
                    break;
                }
                if(sb.charAt(i) == 'b') {
                    sb.setCharAt(i, 'a');//function to replace a char at a specific index
                } else {
                    sb.setCharAt(i, 'b');
                }
                change++;
            }
        }
        System.out.println(i);
    }
}
