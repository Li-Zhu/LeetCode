/*
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.
*/


/*
n = 0;   null  count[0] = 1

n = 1;   1     count[1] = 1 

n = 2;   1         			  2     
		  \					/         count[2] = 1 + 1 = 2
		   count[1]	   	count[1]	


n = 3;   1  					__2__					  3
		  \					  /       \					/				count[3] = 2 + 1 + 2  =5; 
		  count[2]		  count[1]    count[1]		count[2]



n = 4;   1  					__2__					 ____3___                  4
		  \					  /       \					/		 \				 /				count[4] = 5 + 2 + 2 + 5 = 14
		  count[3]		  count[1]    count[2]		count[2]	count[1]	  count[3]


so on...

*/

public class Solution {
	public static int numTrees(int n) { 
		int[] count = new int[n+1];
		count[0] = 1;
		count[1] = 1;
		for (int i = 2; i <= n; i++){
            for (int j = 1; j <= i; j++){
                count[i] += count[j-1] * count[i-j];
            }
        }
        return count[n];
        
    }
}