package com.company.assignment2;

import java.util.Scanner;

public class Q2Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        char ch = s.next().charAt(0);

        switch(ch) {

            case '*' :
                int pdt = (n1 * n2);
                System.out.println(pdt);
                break;
            case '/' :
                 int quotient = (n1 / n2);
                System.out.println(quotient);
                break;
            case '%' :
                int rem = (n1 % n2);
                System.out.println(rem);
                break;
            case '+' :
                int add = (n1 + n2);
                System.out.println(add);
                break;
            case '-' :
                int sub = (n1 - n2);
                System.out.println(sub);
                break;
        }
    }
}
