/*

Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;
/*

public class BinaryTreeinorderTraversal {
    public List<Integer>  inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new ArrayDeque<TreeNode>();
        curr = root;
        while (curr != null || !stack.isEmpty()){
            if (curr != null){
                stack.push(curr);
                curr =curr.left;
            }
            else{
                result = add(stack.pop();.val);
                curr = stack.pop();.right
            }
        }
        return result;



    }
*/

public class Solution { //Recuesion Way
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<Integer> ();
    	inorderTraversal (root, result);
        return result;
    }
    private void inorderTraversal(TreeNode n, List<Integer> r){
    	if (n == null) return;
    	inorderTraversal(n.left,r);
    	r.add(n.val);
    	inorderTraversal(n.right,r);

    }
}