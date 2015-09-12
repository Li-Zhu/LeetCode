/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.


*/



public class Solution {
    public int maxSubArray(int[] nums) {
        
        if (nums.length == 0 || nums == null) return 0;

        int largest = nums[0];
        int maxForNow = nums[0];
        for (int i = 1; i < nums.length ; i++){
            maxForNow = Math.max(nums[i]+maxForNow,nums[i]);
            largest = Math.max(maxForNow,largest);
        }
        
        return largest;
    }
}