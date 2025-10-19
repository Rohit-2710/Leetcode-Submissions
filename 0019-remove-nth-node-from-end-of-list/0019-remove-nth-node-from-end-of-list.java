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

        int l=0;
        if(head==null){
            return head;
        }
        ListNode node =head;
        while(node!=null){
            l+=1;
            node=node.next;
        }

        int end=l-n-1;
        node =head;
        while(end>0){
           node=node.next;
           end-=1; 
        }
        if(node==head && end==-1){
            return head.next;
        }
        if(n==1){
            node.next=null;
        }else{
            node.next=node.next.next;
        }

        return head;
        
    }
}