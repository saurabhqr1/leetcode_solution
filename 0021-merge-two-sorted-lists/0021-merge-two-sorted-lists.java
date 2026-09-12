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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(list1!=null){
            arr.add(list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            arr.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(arr);
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        for(int num : arr){
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return temp.next;
    }
} 