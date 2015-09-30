/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length + 1) )/ 2 ;
        for(int num: nums)
            sum -= num;

        return sum;
    }

    public static void main(String[] args){

    	int[] nums = {0,1,2,3,4,5,6};
    	System.out.println(missingNumber(nums));
    }
}