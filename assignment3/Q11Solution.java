package com.company.assignment3;

import java.util.Scanner;

public class Q11Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(" ");
        StringBuilder st  = toggleChar(str, s);
        System.out.println(st);
    }

    private static StringBuilder toggleChar(String str, StringBuilder s) {
//       StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            int n = (int)str.charAt(i);
            if(n >= 65 && n <= 90) {
                n = n + 32;
                s.append((char) n);
            } else if (n >= 97 && n <= 122) {
                n = n - 32;
                s.append((char) n);
            }
        }
        return s;
    }
}
