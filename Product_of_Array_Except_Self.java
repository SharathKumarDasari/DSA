class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zerocount=0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zerocount++;
            }
            else{
                prod=prod*nums[i];
            }
            
        }
        for(int i=0;i<nums.length;i++){
            if(zerocount>1){
                res[i]=0;
            }
            else if(zerocount==1){
                if(nums[i]==0)
                    res[i]=prod;
                else
                    res[i]=0;
            }
            else{
                res[i]=prod/nums[i];
            }
        }
        return res;
    }
}

/*
	238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
*/	