/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 Sentinel Nodes:: Dummy Nodes used in place of Null nodes to reduce the complexity and increase the robustness of the code
 
 eg. If the initial node(curr) is null, we can not check for the next node(curr.next) as it will not exist. Hence, instead if we use a dummy/sentinel node having ny dummy value, the code will not return an error. 
 
 At last sentinel.next is returned and hence efficiently removing the dummy node taken.
 
 THE FIRST ITEM IF IT EXISTS WILL ALWAYS BE AT SENTINEL.NEXT.
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Edge Conditions
        if(head == null || head.next == null) return head;

        // Initializing dummy node
        ListNode sentinel = new ListNode(0,head);
        
        // Pointer to non-duplicate linkedlist
        // Always runs behind head.
        ListNode pred = sentinel;
        
        while(head != null){
            // If "Not the end of the list" And "Two equal values(duplicate) found"
            if(head.next != null && head.val == head.next.val){
                // Loop through the same condition until unique element found
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                // Update the non-duplicate LL with next unique element
                pred.next = head.next;
            }
            // Otherwise simply move the pred pointer. eg.(1 2 3 4) (all unique values)
            else{
                pred = pred.next;
            }
            
            head = head.next;
        }
        // Efficiently remvoving the dummy node before returning.
        //dummy 1 2 3 ...
        //     ⬆️ 
        return sentinel.next;
    }
}