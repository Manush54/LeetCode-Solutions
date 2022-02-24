/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/* 
# Using Merge Sort
1. Fast & Slow Pointer Approach to find and cut the mid element
2. Recursively call sortList
3. After the list is divided.. Merge the LinkedList
*/

class Solution {
    public ListNode sortList(ListNode head) {
        
        if (head == null || head.next == null) return head;
        
        ListNode prev = null, slow = head, fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;

        return merge(sortList(head),sortList(slow));
    }
    
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode l3 = new ListNode(0), p = l3;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            } else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        
        if(l1 != null)
            p.next = l1;
        
        if(l2 != null)
            p.next = l2;
        
        return l3.next;
    }
}