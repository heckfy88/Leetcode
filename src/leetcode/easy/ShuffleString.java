package leetcode.easy;

// No. 1528

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] new_str = new char[s.length()];
        for (int i = 0; i < s.toCharArray().length; i++) {
            new_str[indices[i]] = s.charAt(i);
        }
        return new String(new_str);
    }
}
