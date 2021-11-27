package assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class createTargetArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};

        int front = 0;
        int mid = ((0)+nums.length-1)/2;//mid is not used but it kind of helped to maintain some point while-- 
        int end = nums.length-1;//--moving ahead and backwards

        ArrayList<Integer> list = new ArrayList<>();

        while(end >= front) {//when end becomes less than front, that value has already been checked by front,--
            if (Math.abs(nums[front]) <= Math.abs(nums[end])) {//-- cause that is why front is ahead of end
                list.add(nums[end]*nums[end]);
                end--;
            } else if (Math.abs(nums[front]) > Math.abs(nums[end])) {
                list.add(nums[front] * nums[front]);
                front++;
            }
        }
        if (front == end) {//there might be condn when front & end point to same value like {0,1,2,3}
            list.add(nums[end]*nums[end]);//here eventually front & end point to same value that is zero index value
        }
        Collections.sort(list);

        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);

        for (Integer x : arr) {
            System.out.print(x + " ");
        }
    }
}
