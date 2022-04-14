/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 LOGIC::
    - MOVE THE FAST POINTER TO N+1th POSITION.
    - MOVE THE SLOW AND FAST POINTER AT THE SAME SPEED TILL FAST REACHES THE END.
    - WHEN THE FAST POINTER REACHES THE END, SLOW POINTER WILL BE AT N-1TH POSITION.
    - SKIP THE Nth POSITION AND CONNECT THE N-1th ELEMENT DIRECTLY TO N+1th ELEMENT.
    - RETURN THE LIST.
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Initialization
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        start.next = head;  // Connects the start node to the "Head ListNode"

        // Moving the fast pointer to n+1th position
        for(int i = 1; i <= n+1; i++){
            fast = fast.next;
        }
        
        // Move slow and fast pointers togather
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return start.next;
    }
}