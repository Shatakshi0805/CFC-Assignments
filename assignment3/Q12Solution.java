package com.company.assignment3;

import java.util.Scanner;

public class Q12Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(" ");
        StringBuilder sb = asciiDiff(str, s);
        System.out.println(sb);
    }

    private static StringBuilder asciiDiff(String str, StringBuilder s) {
        s.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            int c1 = (int)str.charAt(i);
            int c2 = (int)str.charAt(i-1);
            int c = c1-c2;
            s.append(c);
            s.append(str.charAt(i));
        }
        return s;
    }
}
