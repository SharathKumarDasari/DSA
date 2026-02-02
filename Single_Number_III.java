class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);
        }
        int l=0,l1=0;
        for(Map.Entry<Integer,Integer> entry:res.entrySet()){
            if(entry.getValue()==1){
                l1=l;
                l=entry.getKey();
            }
        }
        return new int[]{l,l1};
    }
}

//-------------optimal solution using bit manipulation---------------

class Solution {
    public int[] singleNumber(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            res^=nums[i];
        }
        int cnt=0;
        while(res>0){
            cnt++;
            if((res & 1) == 1){
                break;
            }
            res=res>>1;
        }
        int num1=0;
        int num2=0;
        for(int i=0;i<n;i++){
            if(((nums[i]>>(cnt-1)) & 1)==1){
                num1^=nums[i];
            }
            else{
                num2^=nums[i];
            }
            
        }
    return new int[]{num1,num2};
    }
}



/*
	260. Single Number III

Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
Example 2:

Input: nums = [-1,0]
Output: [-1,0]
Example 3:

Input: nums = [0,1]
Output: [1,0]
 

Constraints:

2 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each integer in nums will appear twice, only two integers will appear once.
*/