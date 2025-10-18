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
    public ListNode middleNode(ListNode head) {
        // int n=1;
        // ListNode node = new ListNode();
        // node=head;
        // while(node.next!=null){
        //     n+=1;
        //     node=node.next;
        // }
        // int m =0;
        // m=n/2;
        // int j=0;
        // node=head;
        // while(j<m){
        //  node=node.next;
        //  j++;
        // }

        // return node;
        List<ListNode> a = new ArrayList<>();
        ListNode node = new ListNode();
        node=head;
        a.add(node);
        while(node.next!=null){
            node=node.next;
            a.add(node);
        }

        int l = a.size();
        int m=l/2;

        return a.get(m);
        
    }
}