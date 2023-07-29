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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //corner case1
        if(head.next == null)
        return null;

        ListNode temp= head;
        int size=0;

        while(temp != null)
        {
            size++;
            temp=temp.next;
        }

        int nthnode=size-n;
        //corner case2
        if(n==size)
            return head.next;

        ListNode prev=head;
        
        for(int i=1;i<nthnode;i++){
            prev=prev.next;
    
        }

        prev.next=prev.next.next;

        return head;
        
    }
}