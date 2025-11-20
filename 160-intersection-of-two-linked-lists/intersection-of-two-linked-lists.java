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
        ListNode temp1=headA;
        ListNode temp2=headB;
        /* HashSet<Integer> set=new HashSet<>();
        while(temp1!=null){
            set.add(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            if(set.contains(temp2.val)){
                return temp2;
            }
            temp2=temp2.next;
        }
        return null; */
        while(temp1!=temp2){
            temp1=temp1==null? headB:temp1.next;
            temp2=temp2==null? headA:temp2.next;
        }
        return temp1;
    }
}