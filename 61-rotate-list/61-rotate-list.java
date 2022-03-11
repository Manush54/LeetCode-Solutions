/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
Two Pointer Approach::
Step1: Find the length of the Linked List -> Traverse the fast pointer at the end of the list and count++
Step2: Find the ListNode to be rotated -> Move the slow pointer to (count - count % k)th node.
Step3: Merge the fast pointer node to the slow pointer and make slow.next = null (i.e. Last Position)
eg. [0,1,2], k = 2 => (3 - 2 % 3) = 2 => 2nd Node
eg. [0,1,2], k = 5 => (3 - 5 % 3) = 2 => 2nd Node
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        
        // Count the length of the linked list
        int count;
        for(count = 0;fast.next != null; count++)
            fast = fast.next;
        
        // Find the head of "Rotated List"
        for(int j = count-(k % count); j > 0; j--)
            slow = slow.next;
        
        // Do the rotation and define thr tail node
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        
        return dummy.next;
    }
}