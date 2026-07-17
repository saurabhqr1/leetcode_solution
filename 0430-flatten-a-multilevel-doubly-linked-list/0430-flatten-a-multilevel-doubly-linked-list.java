/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        Node c = head;
        while(c!=null){
            if(c.child==null) c = c.next;
            else{
                Node fwd =c.next;
                Node cc = flatten(c.child);
                c.child = null;
                c.next = cc;
                cc.prev = c;
                Node temp = cc;
                while(temp.next!=null) temp = temp.next;
                temp.next = fwd;
                if(fwd!=null) fwd.prev = temp;
                c = fwd;
            }
        }
        return head;
    }
}