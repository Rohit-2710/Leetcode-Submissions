/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Boolean> hm = new HashMap<>();

        if(headA==null || headB==null){
            return null;
        }

        ListNode node = headA;
        while(node!=null){
            hm.put(node,true);
            node=node.next;
        }
        node=headB;
        while(node!=null){
         if(hm.containsKey(node)){
            return node;
         }
         node=node.next;
        }
        return null;
        
    }
}