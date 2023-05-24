package com.company.ransomnote;

import java.util.HashMap;

/**
 * @author Grigory Yakovlev
 */
public class Solution {
    public static void main(String[] args) {
        String ransomNote = "aaf";
        String magazine = "aasfasfasggasg";

        Solution solution = new Solution();
        System.out.println(solution.canConstructV3(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        String mag = magazine;
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            String resReplace = mag.replaceFirst(String.valueOf(c), "");
            if(resReplace.equals(mag)) return false;
            mag = resReplace;
        }
        return true;
    }

    public boolean canConstructV3(String r, String m) {
//         if(m.length() < r.length()) return false;
//         char[] rArr = r.toCharArray();
//         char[] mArr = m.toCharArray();

//         int[] cont = new int[26];
//         for(int i = 0; i < mArr.length; i++) {
//             cont[mArr[i] - 97]++;
//         }


//         for(int i = 0; i < rArr.length; i++) {
//             if(cont[rArr[i] - 97] - 1 < 0) return false;
//             cont[rArr[i] - 97]--;
//         }

//         return true;
        // The English Alphabet consists 26
        int[] arr = new int[26];
        int index;
        for(char c : r.toCharArray()){
            index = m.indexOf(c, arr[c-'a']);
            if(index == -1){
                return false;
            }
            arr[c - 'a'] = index + 1;
        }
        return true;
    }

    public boolean canConstructV2(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetter = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetter.getOrDefault(m, 0);
            magazineLetter.put(m, currentCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int currentCount = magazineLetter.getOrDefault(r, 0);
            if(currentCount == 0){
                return false;
            }
            magazineLetter.put(r, currentCount - 1);
        }
        return true;
    }
}
