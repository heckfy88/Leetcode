package leetcode.easy;

// No. 1832

import java.util.Set;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        int counter = 0;
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h",
                "i", "j", "k", "l", "m", "n", "o","p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (String letter : alphabet) {
            if (sentence.contains(letter)) {
                counter++;
            }
        }
        return counter == 26;
    }
}


/*
using sets

    String s=sentence;
         HashSet<Character> hset=new HashSet<>();
         for(int i=0;i<s.length();i++)
		 {
             hset.add(s.charAt(i));
         }
        if(hset.size()!=26) return false;
        return true;




 */