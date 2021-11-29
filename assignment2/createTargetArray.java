package assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class createTargetArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};

        int front = 0;
        int mid = ((0)+nums.length-1)/2;//mid is used, but it kind of helped to maintain the positions of front
        int end = nums.length-1;//& end

        ArrayList<Integer> list = new ArrayList<>();

        while(end >= front) {//if end becomes less than front, that value has already been considered by front 
            if (Math.abs(nums[front]) <= Math.abs(nums[end])) {.//cause that is why front is ahead of end
                list.add(nums[end]*nums[end]);
                end--;
            } else if (Math.abs(nums[front]) > Math.abs(nums[end])) {
                list.add(nums[front] * nums[front]);
                front++;
            }
        }
        if (front == end) {//there may be a situation when end becomes equal to front for example
            list.add(nums[end]* nums[end]);//{0,1,2,3} here, front & end point to same value zero index eventually 
        }     
        Collections.sort(list);

        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);

        for (Integer x : arr) {
            System.out.print(x + " ");
        }
    }
}
