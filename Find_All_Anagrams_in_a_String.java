class Solution {
    public boolean find(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int l=0,r=0;
        List<Integer> res=new ArrayList<>();
        if(s.length()<p.length()) return res;
        int arr[]=new int[26];
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-'a']++;
        }
        while(r<s.length()){
            arr[s.charAt(r)-'a']--;
            r++;
            if(r-l==p.length()){
                if(find(arr)){
                    res.add(l);
                }
                arr[s.charAt(l)-'a']++;
                l++;
            }
        }
        return res;
    }
}

/*
	438. Find All Anagrams in a String

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 

Constraints:

1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.
*/