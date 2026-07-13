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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp1 = new ListNode(-1);
        ListNode temp2 = new ListNode(-1);
        ListNode t = head;
        ListNode t1 = temp1;
        ListNode t2 = temp2;
        while( t != null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;
            t2.next = t;
             if(t != null) t = t.next;
            t2 = t2.next;

        }
        t1.next = temp2.next;
        return temp1.next;


    }
}