package leetcode.easy;

// No. 1672

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > wealth) wealth = sum;
        }
        return wealth;
    }
}