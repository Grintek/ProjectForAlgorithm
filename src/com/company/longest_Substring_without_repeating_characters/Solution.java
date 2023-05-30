package com.company.longest_Substring_without_repeating_characters;

/**
 * @author Grigory Yakovlev
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        int indexStep = 0;
        int count = 0;
        StringBuilder subString = new StringBuilder();
        while (indexStep < s.length()){
            String step = s.substring(indexStep, indexStep + 1);
            int foundIndex = subString.indexOf(step);
            if (foundIndex != -1) {
                count = Math.max(subString.length(), count);

                while (foundIndex != -1) {
                    subString.delete(0, foundIndex + 1);
                    foundIndex = subString.indexOf(step);
                }
            }
            subString.append(step);
            indexStep++;
        }
        if(count < subString.length()) {
            count = subString.length();
        }
        return count;
    }
}
