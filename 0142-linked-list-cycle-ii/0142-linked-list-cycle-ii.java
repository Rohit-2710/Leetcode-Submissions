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
    public ListNode detectCycle(ListNode head) {

        // Map<ListNode, Boolean> hm = new HashMap<>();
        // ListNode node = head;

        // if(head==null){
        //     return head;
        // }
        // if(head.next==null){
        //     return null;
        // }
        // hm.put(head,true);

        // while(node.next!=null){
        //     node=node.next;
        //     if(hm.containsKey(node)){
        //         return node;
        //     }
        //     hm.put(node,true);
        // }
        // return null;

        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }

        ListNode slow=head,fast=head;
        boolean ifLoop=false;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ifLoop=true;
                break;
            }
        }
        if(!ifLoop){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
        
    }
}