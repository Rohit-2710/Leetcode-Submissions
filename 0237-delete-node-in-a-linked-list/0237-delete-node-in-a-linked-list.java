/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    while(true){
        ListNode prev=new ListNode(node.val);

    prev=node;
    node=node.next;
    prev.val=node.val;

    if(node.next==null){
        prev.next=null;
        break;
    }
    }
        
    }
}