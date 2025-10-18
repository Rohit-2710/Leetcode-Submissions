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
    public boolean isPalindrome(ListNode head) {
        
        String s=""+head.val;
        ListNode node =head;
        while(node.next!=null){
            node=node.next;
            s=s+node.val;
        }
        s=s.trim();

        int l=0,r=(s.length()-1);

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l+=1;
            r-=1;
        }
        return true;
    }
}