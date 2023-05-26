package com.company.is_subsequence;

/**
 * @author Grigory Yakovlev
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isSubsequence("aaaaaa", "bbaaaa"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int indexS = 0, indexT = 0;
        while (indexT < t.length()){
            if(s.charAt(indexS) == t.charAt(indexT)){
                indexS++;
            }
            indexT++;

            if(indexS > s.length() - 1) {
                return true;
            }
        }
        return false;
    }
}
