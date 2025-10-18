/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

       if(head==null){
        return false;
       }
        
        ListNode node = head;
        while(true){
            if(node.next==null){
                return false;
            }
            if(node.val==Integer.MAX_VALUE){
                return true;
            }
            node.val=Integer.MAX_VALUE;
            node=node.next;
        }
        
    }
}