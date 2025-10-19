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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        int l =0;
        ListNode node = head;
        while(node!=null){
            l+=1;
            node=node.next;
        }

        ListNode slow=head;
        ListNode fast= head.next;


        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        if((l&1)==0){
        slow.next=slow.next.next;
        }else{
         prev.next=prev.next.next;
        }

        return head;
        
    }
}