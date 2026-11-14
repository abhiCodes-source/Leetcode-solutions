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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return head;
        ListNode A=new ListNode(-1);
        ListNode B=new ListNode(-2);
        ListNode temp=head;
        ListNode old=A;
        ListNode extra=B;
        while(temp!=null){
            if(temp.val<x){
                A.next=temp;
                A=A.next;
            }
            else{
                B.next=temp;
                B=B.next;
            }
            temp=temp.next;
        }
        B.next = null;
        A.next=extra.next;
        return old.next;
    }
}