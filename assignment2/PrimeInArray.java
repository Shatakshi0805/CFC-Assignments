package com.company.assignment2;

public class PrimeInArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 19, 25};


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 2; j < arr[i]; j++) {//n(square) complexity, still needs to be improved
                if (arr[i] % j == 0) {
                    count += 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(arr[i] + " is prime");
            } else {
                System.out.println(arr[i] + " is not prime");
            }
        }


    }
}