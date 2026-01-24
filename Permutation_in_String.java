class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int l = 0;
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int r = 0; r < s2.length(); r++) {
            freq[s2.charAt(r) - 'a']--;

            if (r - l + 1 > s1.length()) {
                freq[s2.charAt(l) - 'a']++;
                l++;
            }

            if (r - l + 1 == s1.length()) {
                if (isAllZero(freq)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isAllZero(int[] freq) {
        for (int x : freq) {
            if (x != 0) return false;
        }
        return true;
    }
}


/*
	567. Permutation in String

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
*/