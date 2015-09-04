
 
 public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
  }

 
public class Solution {
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

