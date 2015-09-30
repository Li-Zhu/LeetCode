/*

Given a binary tree, return the preorder traversal of its nodes' values.


Pre-Order 
    1
  /   \
 2     3

Post-Order
    3
  /   \
 1     2

 In-Order
    2
  /   \
 1     3


For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].



   6

 3    8

1,4  7,9    ------> 6,3,8,1,4,7,9

Note: Recursive solution is trivial, could you do it iteratively?


 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
class Solution { // recursion Way
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer> ();
        preorderTraversal(root,result);
        return result;
    }
    
    private void preorderTraversal(TreeNode n,List<Integer> l){
        if (n == null) return;
        l.add(n.val);
        preorderTraversal(n.left,l);
        preorderTraversal(n.right,l);
    }
    
    
}
*/
import java.util.Stack;
import java.util.*;
 
class Solution { // Iterative Way
    public static List<Integer> preorderTraversal(TreeNode root) {
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	List<Integer> result = new ArrayList<Integer> ();
    	if (root != null) stack.push(root);
    	
    	while (!stack.empty()){
    		TreeNode n =stack.pop();
    		result.add(n.val);
    		if(n.right != null) stack.push (n.right);
    		if(n.left != null) stack.push (n.left);
       	}
    	return result;
  }
}
