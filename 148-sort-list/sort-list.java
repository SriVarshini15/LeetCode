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
    public ListNode sortList(ListNode head) {
        /*ListNode current=head;

        while(current!=null){
            ListNode nextNode=current.next;
            ListNode min=current;
            while(nextNode!=null){
                if(min.val>nextNode.val){
                    min=nextNode;
                }
                nextNode=nextNode.next;
            }
            int temp=min.val;
            min.val=current.val;
            current.val=temp;
            current=current.next;
        }*/
        if (head == null || head.next == null)
            return head;
        ListNode mid=midElement(head);
        ListNode rightHead = mid.next;
        mid.next=null;
        ListNode right=sortList(head);
        ListNode left=sortList(rightHead);

        return merge(right,left);

    }
    public static ListNode midElement(ListNode temp){
        ListNode slow=temp;
        ListNode fast=temp.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode newNodee=new ListNode(0);
        ListNode dummy=newNodee;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                dummy.next=l1;
                l1=l1.next;
            }else{
                dummy.next=l2;
                l2=l2.next;
            }
            dummy=dummy.next;
        }
        if(l1!=null){
            dummy.next=l1;
        }if(l2!=null){
            dummy.next=l2;
        }
        return newNodee.next;
    }
}

/*
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newhead = slow.next;
        slow.next = null;
        head = sortList(head);
        newhead = sortList(newhead);
        return merge(head, newhead);
    }

    ListNode merge(ListNode a, ListNode b) {
        if (a == null) return b;
        if (b == null) return a;
        
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                cur.next = a;    
                a = a.next;
            } else {
                cur.next = b;
                b = b.next;
            }
            cur = cur.next;
        }
        
        if (a == null) {
            cur.next = b;
        } else if (b == null) {
            cur.next = a;
        }
        return dummy.next;
    }
}
*/
