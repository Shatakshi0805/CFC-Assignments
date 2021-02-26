package com.company.assignment2;

import java.util.Scanner;

public class Q3Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        if (c >= 65 && c <= 90) {
            System.out.println("Uppercase");
        } else if (c >= 97 && c <= 122){
            System.out.println("Lowercase");
        }
    }
}
