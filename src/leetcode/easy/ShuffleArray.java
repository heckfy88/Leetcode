package leetcode.easy;

// No. 1470

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] nums_res = new int[2 * n];
        for (int i = 0, j = 0; i < n && j < 2*n; i++, j+=2) {
            nums_res[j] = nums[i];
            nums_res[j+1] = nums[i+n];
        }
        return nums_res;
    }
}
