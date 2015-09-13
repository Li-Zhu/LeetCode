/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
*/

public class Solution {
    public int findMin(int[] nums) {
    	int low = 0;
    	int high = nums.length-1;
    	while (low < high){
    		int mid = low + (high - low) / 2; 
    		// (high+low) /2 may cause overflow  if the sum of low and high is 
    		//greater than the maximum positive int value (231 - 1).
    		if (nums[mid] > nums[high]) low = mid +1;
    			// minimum numer is on right 
    		if (nums[mid] < nums[high]) high  = mid;
    			//minimum number is on left
    	}
        return num[low];
    }
}