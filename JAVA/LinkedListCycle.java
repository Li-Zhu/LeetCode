
/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

*/


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
         next = null;
     }
 }
 
public class Solution { // faster and slow runners
    public boolean hasCycle(ListNode head) {
    	if (head == null) return false;

    	ListNode fast = head;
    	ListNode slow = head;

    	while (fast.next != null && fast.next.next != null ){
    		fast = fast.next.next;
    		slow = slow.next;

    		if (fast == slow) return true;

    	}

    	return false;

    	
}