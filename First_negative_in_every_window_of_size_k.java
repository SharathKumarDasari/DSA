class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int i=0,j=0;
        List<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        while(j<arr.length){
            if(arr[j]<0){
                q.offer(j);
            }
            if(j-i+1<k){
                j++;
            }
            else{
                if(!q.isEmpty()){
                    res.add(arr[q.peek()]);
                }
                else{
                    res.add(0);
                }
                if(!q.isEmpty() && i==q.peek()){
                    q.poll();
                }
                i++;
                j++;
            }
        }
        return res;
    }
}

/*
	First negative in every window of size k

Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Note: If a window does not contain a negative integer, then return 0 for that window.

Examples:

Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
Output: [-8, 0, -6, -6]
Explanation:
Window [-8, 2] First negative integer is -8.
Window [2, 3] No negative integers, output is 0.
Window [3, -6] First negative integer is -6.
Window [-6, 10] First negative integer is -6.
Input: arr[] = [12, -1, -7, 8, -15, 30, 16, 28] , k = 3
Output: [-1, -1, -7, -15, -15, 0] 
Explanation:
Window [12, -1, -7] First negative integer is -1.
Window [-1, -7, 8] First negative integer is -1.
Window [-7, 8, -15] First negative integer is -7.
Window [8, -15, 30] First negative integer is -15.
Window [-15, 30, 16] First negative integer is -15.
Window [30, 16, 28] No negative integers, output is 0.
Input: arr[] = [12, 1, 3, 5] , k = 3
Output: [0, 0] 
Explanation:
Window [12, 1, 3] No negative integers, output is 0.
Window [1, 3, 5] No negative integers, output is 0.

Constraints:
1 <= arr.size() <= 106
-105 <= arr[i] <= 105
1 <= k <= arr.size()


*/