package com.company.assignment3;

import java.util.ArrayList;

public class Q9Solution {
    public static void main(String[] args) {
        int[] nums = {2, 5, -1, 7, -3, -1, -2};
        int k = 4;
        int sum = maxminKsubArray(nums, k);
        System.out.println(sum);
    }

    private static int maxminKsubArray(int[] nums, int k) {
        ArrayList<Integer> maxInd = new ArrayList<>();
        ArrayList<Integer> minInd = new ArrayList<>();
        int sum = 0; //below code is for elements 0 to 3
        for (int i = 0; i < k; i++) { // for adding first 4 elements of array in lists
            while (!maxInd.isEmpty() && nums[maxInd.get(0)] <= nums[i]) {//if curr ele is greater than already stored ele->
                maxInd.remove(0); //then theres no use of already one so remove it
            }
            while (!minInd.isEmpty() && nums[minInd.get(0)] >= nums[i]) {//if curr ele is smaller than already stored ele->
                minInd.remove(0); //then theres no use of already one so remove it
            }
            maxInd.add(i);
            minInd.add(i);
        }
//        sum = sum + nums[maxInd.get(0)] + nums[minInd.get(0)];
        //below code is for elements 4 to above
        // removing elements not in current window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[maxInd.get(0)] + nums[minInd.get(0)];
            if(!maxInd.isEmpty() && maxInd.get(0) <= i-k) {//here i = 4 nd k = 4 so  i-k=0 so 0th ele would be removed
                maxInd.remove(0);
            }
            if(!minInd.isEmpty() && minInd.get(0) <= i-k) {
                minInd.remove(0);
            }
            // for comparison of new incoming elements each time the window slides by  one element
            while (!maxInd.isEmpty() && nums[maxInd.get(0)] <= nums[i]) {//if curr ele is greater than already stored ele->
                maxInd.remove(0); //then theres no use of already one so remove it
            }
            while (!minInd.isEmpty() && nums[minInd.get(0)] >= nums[i]) {//if curr ele is smaller than already stored ele->
                minInd.remove(0); //then theres no use of already one so remove it
            }
            maxInd.add(i);
            minInd.add(i);
        }
        sum = sum + nums[maxInd.get(0)] + nums[minInd.get(0)];
        return sum;
    }
}
