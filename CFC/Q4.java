package CFC;

import java.util.Scanner;

public class Q4Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 2;
        int res = 0;
        int n = input.nextInt();
        System.out.println(i);
        for (int j = 1; j < n; j++) {
            res = (i + (4*j));
            i = res;
            System.out.println(i);
        }
    }
}
