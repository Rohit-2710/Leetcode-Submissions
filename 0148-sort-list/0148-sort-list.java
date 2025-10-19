class Solution {
    public ListNode sortList(ListNode head) {

     return rec(head);
    }

    public ListNode rec(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode m = mid(head);
        ListNode rightHead = m.next;
        m.next = null;

        ListNode a = rec(head);
        ListNode b = rec(rightHead);

        return merge(a,b);

    }

    public ListNode merge(ListNode a, ListNode b){
        ListNode curr = null;
        ListNode prev =null;
        ListNode head = null;

        while(a!=null && b!=null){
            if(a.val<b.val){
                curr=a;
                if(head==null){
                    head=curr;
                    prev=curr;
                }else{
                 prev.next=curr;
                 prev=curr;
                }
                a=a.next;
            }else{
                curr=b;
                if(head==null){
                    head=curr;
                    prev=curr;
                }else{
                 prev.next=curr;
                 prev=curr;
                }
                b=b.next;
            }
        }
        while(a!=null){
            curr=a;
                if(head==null){
                    head=curr;
                    prev=curr;
                }else{
                 prev.next=curr;
                 prev=curr;
                }
                a=a.next;
            
        }
        while(b!=null){
            curr=b;
                if(head==null){
                    head=curr;
                    prev=curr;
                }else{
                 prev.next=curr;
                 prev=curr;
                }
                b=b.next;
        }

        return head;

    }

    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
