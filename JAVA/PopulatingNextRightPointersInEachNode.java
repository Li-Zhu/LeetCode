/*
Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
For example,
Given the following perfect binary tree,
         1
       /  \
      2    3
     / \  / \
    4  5  6  7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
 
 class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
  }

*/
  
class Solution1 { // O(1) Space time
    public void connect(TreeLinkNode root) {
    	TreeLinkNode cur;
    	while (root != null) { // 
    		cur = root;
    		while (cur != null && cur.left != null){ 
          // cur != null check if cur reachs the most left node in this depth
          // cur.left != null check if cur reach the leaves.
    			cur.left.next = cur.right;
    			if (cur.next != null) cur.right.next = cur.next.left;
    			cur = cur.next;
    		}
    		root = root.left;
    	}
    }
}

class Solution2 { // Recursion Way 
    public void connect (TreeLinkNode root) {
      if (root != null) {
        connectNode (root);
        connect (root.left);
        connect (root.right);
      }
    }

    private void connectNode(root) {
      if (root.left != null) {
        root.left.next = root.right
        if (root.next != null) {
          root.right.next = root.next.left;
        }
      }
    }


