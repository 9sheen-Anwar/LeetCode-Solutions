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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
            return head;
        
        ListNode ptr=head;
        int size=0;
        while(ptr!=null){
            size++;
            ptr=ptr.next;
        }
        k=k%size;
        for(int i=1;i<=k;i++){
            ListNode curr=head.next;
            ListNode prev=head;
            while(curr.next!=null){
                prev=prev.next;
                curr=curr.next;
            }
            if(prev!=null){
            curr.next=head;
            head=curr;
            prev.next=null;
            }


        }

        return head;


        
    }
}