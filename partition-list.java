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
    public ListNode partition(ListNode head, int x) {
        ListNode smaller_h = new ListNode(0);
        ListNode smaller = smaller_h;
        ListNode greater_h= new ListNode(0);
        ListNode greater= greater_h;
        while(head!=null)
        {
            if(head.val<x)
            {
                smaller.next=head;
                smaller=smaller.next;
            }
            else
            {
                greater.next=head;
                greater=greater.next;
            }

            head=head.next;

        }
         greater.next=null;
        smaller.next=greater_h.next;
        return smaller_h.next; 
       
    }
}