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
        ListNode cur=head;
        ListNode nextNode=head.next;
        while(cur!=null && nextNode!=null){
            if(cur.val==nextNode.val){
                cur.next=nextNode.next;
                nextNode=nextNode.next;
            }else{
                cur=nextNode;
                nextNode=nextNode.next;
            }
        }
        return head;
    }
}