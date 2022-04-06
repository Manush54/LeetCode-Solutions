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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        int cnt = 0;
        while(left.next != null){
            cnt++;
            if(cnt == k){
                break;
            }
            left = left.next;
        }
        
        ListNode right = head, diff = left;
        while(diff.next != null){
            right = right.next;
            diff = diff.next;
        }
        
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        
        return head;
    }
}