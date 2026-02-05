class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxsum=arr[0];
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxsum=Math.max(maxsum,sum);
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}

/*
	Max Sum Subarray of size K
Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.

Examples:

Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum.
Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Output: 39
Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
Input: arr[] = [100, 200, 300, 400], k = 1
Output: 400
Explanation: arr3 = 400, which is maximum.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106
1 ≤ k ≤ arr.size()
*/