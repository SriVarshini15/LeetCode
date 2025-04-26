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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode left=head;
        ListNode right=head.next;
        while(right!=null){
            if(left.val!=right.val){
                left.next=right;
                left=left.next;
            }
            right=right.next;
        }
        left.next=null;
        return head;
    }
}