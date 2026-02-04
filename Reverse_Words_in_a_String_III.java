class Solution {
    public void reverse(int l,int r,char c[]){
        while(l<r){
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            r--;
            l++;
        }
    }
    public String reverseWords(String s) {
        char[] c=s.toCharArray();
        int start=0;
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || c[i]==' '){
                reverse(start,i-1,c);
                start=i+1;
            }
        }
        return new String(c);
    }
}

/*
	557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
*/