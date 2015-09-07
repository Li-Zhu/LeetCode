/*

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.


*/
public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority =  nums[0];
        for (int i : nums){
            if (count == 0){
            	majority = i;
            	count ++;
            }
            else if (i == majority) count++;
            else count--;
        }
        return majority; // num of Others is less than num of majority element.
    }
}