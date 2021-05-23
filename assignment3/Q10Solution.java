package com.company.assignment3;

import java.util.Scanner;

public class Q10Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s1 = "";
        String replace = oddEvenChar(str, s1);
        System.out.println(replace);
    }

    public static String oddEvenChar(String str, String s1) {
        //StringBuilder s = new StringBuilder(str);//changed input type string to stringbuilder
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                char ch = str.charAt(i);
                int n = (int) ch + 1;
                ch = (char) n;
                s1 = s1 + ch;
            } else {
                char ch = str.charAt(i);
                int n = (int) ch - 1;
                ch = (char) n;
                s1 = s1 + ch;
            }
        }
        return s1;
    }
}