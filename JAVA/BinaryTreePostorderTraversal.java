/*

Given a binary tree, return the postorder traversal of its nodes' values.


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




example: 


   6

 3    8

1,4  7,9    ------> [1,4,3,7,9,8,6]


import java.util.*;
 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

*/
public class BinaryTreePostorderTraversal { // just reverse the preorder traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer> ();
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        while (!stack.isEmpty()||root != null) {
        	if (root != null) {
        		stack.push(root);
        		result.add(root.val);
        		root = root.right;
        	}
        	else {
        		root = stack.pop().left;
        	}
        }

        Collections.reverse(result);
        return result;
    }
}


public class Solution { //Recuesion Way
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> result = ArrayList<Integer> ();
    	postorderTraversal (root, result);
        return result;
    }
    private void postorderTraversal(TreeNode n, List<Integer> r){
    	if (n == null) return;
    	postorderTraversal(n.left,r);
    	postorderTraversal(n.right,r);
    	r.add(n.val);

    }
}




