/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to

     4
   /   \
  7     2
 / \   / \
9   6 3   1



 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public static TreeNode invertTree(TreeNode root) {
    	invert(root);
    	return root;
    }

    private static void invert(TreeNode n){
    	if (n == null) return;
    	TreeNode temp = n.left;
    	n.left = n.right;
    	n.right = temp;
    	invert(n.left);
    	invert(n.right);

    }