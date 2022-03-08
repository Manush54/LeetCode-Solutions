/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 ______________________________________________________________________________
 Two Pointer Approach
 If there is a loop in the Linked List, the slow and fast pointers will meet at some point
 Else fast.next will reach to an end.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow) return true;
        }
        return false;
    }
}