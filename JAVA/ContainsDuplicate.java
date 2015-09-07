/*
Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.
*/





//Differences between HashMap, HashTable and HashSet.
/*

HashMap			Allow null for both key and value      Unsynchronized(prefer it when in thread safety)

HashTable		Don't allow null for both key and value      synchronized(come with its cost) 

HashSet  		HashSet does not allow duplicate values. It provides add method rather put method. 
You also use its contain method to check whether the object is already available in HashSet. 
HashSet can be used where you want to maintain a unique list.
*/



import java.util.*;

public class Solution1 {
    public boolean containsDuplicate(int[] nums) {
    	HashSet<Integer> hs= new HashSet<Integer>(); 
    	for (int i : nums) {
    		if (hs.contains(i)){
    			return true;
    		}
    		else hs.add(i);
    	} 
    	return false;
        
    }
}

public class Solution2 {
    public boolean containsDuplicate(int[] nums) {
    	Arrays.sort(nums);
    	for (int i = 1; i<nums.length;i++){
    		if (nums[i] == nums[i-1]) 
    			return true;
    	}

    	return false;
        
    }
}