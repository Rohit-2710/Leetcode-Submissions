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
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null)return head;
        
        ListNode prevEven =null;
        ListNode headEven=null;
        ListNode prevOdd = null;
        ListNode headOdd=null;
        ListNode node =head;

        int counter=1;

        while(node!=null){
            if((counter&1)==0){
                if(headEven==null){
                   headEven=node;
                   prevEven=headEven;
                }else{
                   prevEven.next=node;
                   prevEven=node;
                }
            }else{

                if(headOdd==null){
                   headOdd=node;
                   prevOdd=headOdd;
                }else{
                   prevOdd.next=node;
                   prevOdd=node;
                }
            }
            node=node.next;
            counter+=1;
        }
        if(prevEven!=null){
            prevEven.next=null;
        }
        if(prevOdd!=null){
            prevOdd.next=headEven;
        }

        return headOdd;
    }
}