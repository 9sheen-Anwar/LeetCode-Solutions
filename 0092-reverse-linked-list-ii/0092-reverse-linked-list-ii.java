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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
            return head;
        ListNode prev=null;
        ListNode curr=head;
        for(int i=1;curr!=null && i<left;i++){
            prev=curr;
            curr=curr.next;
        }

        ListNode ptr1=prev;
        ListNode ptr2=curr;
        for(int i=left;i<=right;i++){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        if(ptr1!=null)
            ptr1.next=prev;
        else
            head=prev;
        
        ptr2.next=curr;
        return head;

        
        
        
    }
}