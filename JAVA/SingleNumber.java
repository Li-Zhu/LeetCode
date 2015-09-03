/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note: 
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?


*/

//  Bit Manipulation. XOR : return 1 only on two numbers are different, else
//  return 0.  so in the end, only one number left.  11 ^ 11 =00  00 ^ 100 == 100 (100 left);

public class Solution {
    public int singleNumber(int[] nums) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}       
}