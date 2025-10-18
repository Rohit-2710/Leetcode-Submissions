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
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }
       
        ListNode node = head;
        ListNode temp = new ListNode(head.val);

        while(node.next!=null){
            node=node.next;
            ListNode newNode = new ListNode(node.val);
            newNode.next=temp;
            temp=newNode;
        }
        return temp;
        
    }
}