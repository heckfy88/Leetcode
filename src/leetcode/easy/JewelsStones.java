package leetcode.easy;

// No. 771

public class JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        for (char stone : stones.toCharArray())
            for (char jewel : jewels.toCharArray()) {
                if (stone == jewel) counter++;
            }
        return counter;
    }
}
