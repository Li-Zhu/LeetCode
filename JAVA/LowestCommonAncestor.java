/*
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5

For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, 
since a node can be a descendant of itself according to the LCA definition.   


 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
 		if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left,p,q);
 		if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right,p,q);
 		return root;
}