package assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class squareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};

        int front = 0;
        int mid = ((0)+nums.length-1)/2;
        int end = nums.length-1;

        ArrayList<Integer> list = new ArrayList<>();

        while(end >= mid && front <= mid) {
            if (Math.abs(nums[front]) <= Math.abs(nums[end])) {
                list.add(nums[end]*nums[end]);
                end--;
            } else if (Math.abs(nums[front]) > Math.abs(nums[end])) {
                list.add(nums[front] * nums[front]);
                front++;
            }
        }
//        list.add(end);
        Collections.sort(list);

        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);

        for (Integer x : arr) {
            System.out.print(x + " ");
        }
    }
}
