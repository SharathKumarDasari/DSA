class Solution {
    public static int fun(int n,int dp[],int heights[]){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=fun(n-1,dp,heights)+Math.abs(heights[n]-heights[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1)
        right=fun(n-2,dp,heights)+Math.abs(heights[n]-heights[n-2]);
        return dp[n]=Math.min(left,right);
    }
    public static int frogJump(int[] heights) {
        int n=heights.length;
        int dp[]=new int[n+1];
        java.util.Arrays.fill(dp,-1);
        return fun(n-1,dp,heights);
    }
    public static void main(String args[]){
        // int arr[]={7,5,1,2,6};
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(frogJump(arr));
    }
}

/*
	Frog Jump
A frog wants to climb a staircase with n steps. Given an integer array heights, where heights[i] contains the height of the ith step.



To jump from the ith step to the jth step, the frog requires abs(heights[i] - heights[j]) energy, where abs() denotes the absolute difference. The frog can jump from any step either one or two steps, provided it exists.



Return the minimum amount of energy required by the frog to go from the 0th step to the (n-1)th step.


Example 1

Input: heights = [2, 1, 3, 5, 4]

Output: 2

Explanation:

One possible route can be,

0th step -> 2nd Step = abs(2 - 3) = 1

2nd step -> 4th step = abs(3 - 4) = 1

Total = 1 + 1 = 2.

Example 2

Input: heights = [7, 5, 1, 2, 6]

Output: 9

Explanation:

One possible route can be,

0th step -> 1st Step = abs(7 - 5) = 2

1st step -> 3rd step = abs(5 - 2) = 3

3rd step -> 4th step = abs(2 - 6) = 4

Total = 2 + 3 + 4 = 9.
*/