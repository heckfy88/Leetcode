package leetcode.easy;

// No. 1365

import java.util.Arrays;


public class CountSmallerNumbers {
    // O(n^2)
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int counter = 0;
        int[] new_nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length -1; j++) {
                if (nums[i] > nums [j] & j != i) {
                    counter++;
                }
            }
            new_nums[i] = counter;
            counter = 0;
        }
        return new_nums;
    }

    // O(nlg(n))
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] copy = new int[len];
        int[] res = new int[len];
        System.arraycopy(nums, 0, copy, 0, len);
        Arrays.sort(copy);
        for (int i = 0; i < len; i++) {
            int idx = Arrays.binarySearch(copy, nums[i]);
            while (idx > 0 && copy[idx] == copy[idx - 1]) idx--;
            res[i] = idx;
        }
        return res;
    }
}
