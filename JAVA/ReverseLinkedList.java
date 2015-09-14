/*
Reverse a singly linked list.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?

*/

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 

class Solution {
    public ListNode reverseList_Iteratively(ListNode head) { // reversed iteratively
    	ListNode newHead = null;
    	while (head != null) {
    		ListNode next = head.next;
    		head.next = newHead;
    		newHead = head;
    		head = next;
    	}
    	return newHead;
    }



    public ListNode reverseList_Recursively(ListNode head) { // reversed recysively
    	return reverseList(head, null);
    }

    private ListNode reverseList (ListNode head, ListNode newHead){
    	if (head == null) return newHead;
    	ListNode next = head.next;
    	head.next = newHead;
    	return reverseList(next,head);
    }
}