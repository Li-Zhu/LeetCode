/*

Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].


[a[0],a[1],a[2],a[3]]:

A: {              1,         a[0],    a[0]*a[1],    a[0]*a[1]*a[2],  }

X

B: { a[1]*a[2]*a[3],    a[2]*a[3],         a[3],                 1,  }


*/


public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // products of A
        int temp = 1;

        for (int i = 0; i< nums.length; i++){
            result[i] = temp;
            temp *= nums[i];
        }

        // products of B 
        temp =1;
        for (int i = nums.length-1; i>=0; i--){
            result[i] *= temp;
            temp *= nums[i];
        }
        return result;

        }
}