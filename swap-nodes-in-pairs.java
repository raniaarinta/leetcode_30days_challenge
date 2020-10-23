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
    public ListNode swapPairs(ListNode head) {
        ListNode result= new ListNode(0);
        result.next=head;
        ListNode current= result;
        while(current.next!=null && current.next.next!=null)
        {
            ListNode slow= current.next;
            ListNode fast= current.next.next;
            slow.next=fast.next;
            current.next= fast;
            current.next.next=slow;
            current=current.next.next;
        }
        return result.next;
    }
}