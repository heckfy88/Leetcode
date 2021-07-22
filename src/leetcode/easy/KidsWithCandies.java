package leetcode.easy;

// No. 1431

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> candies_cond = new ArrayList<Boolean>();
        int max_candy_count = 0;
        for (int candy : candies)  if (max_candy_count <= candy) max_candy_count = candy;
        for (int candy : candies) candies_cond.add(candy + extraCandies >= max_candy_count);
        return candies_cond;
    }
}