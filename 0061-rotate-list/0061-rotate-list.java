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

        if(head==null || head.next==null){
            return head;
        }

        ListNode newHead=head;
        ListNode prev=null;
        ListNode node =head;

        int l =0;

        while(node!=null){
            l+=1;
            node=node.next;
        }

        int modded = k%l;
        node =head;

        while(modded>0){
            node=newHead;
            while(node.next!=null){
                prev=node;
                node=node.next;
            }
            node.next=newHead;
            newHead=node;
            prev.next=null;
            modded-=1;
        }

        return newHead;
        
    }
}