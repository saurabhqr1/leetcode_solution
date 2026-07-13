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
    public ListNode reverse(ListNode head){
        ListNode c = head;
        ListNode p = null;
        ListNode f = null;
        while(c!=null){
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode i = head;
        ListNode j = head;
        while(j.next != null && j.next.next != null){
            i = i.next;
            j = j.next.next;
        }
        ListNode temp = i.next;
        i.next = null;
        temp = reverse(temp);
        ListNode t1 ;
        ListNode t2 ;
        ListNode t = head;
        while( temp != null ){
            t1 = t.next;
            t2 = temp.next;
            t.next = temp;
            temp.next = t1;
            t = t1;
            temp = t2;
        }

    }
}