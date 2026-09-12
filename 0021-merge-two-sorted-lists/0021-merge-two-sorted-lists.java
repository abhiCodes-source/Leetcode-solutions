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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode ans=new ListNode(-1);
        ListNode dummy = ans;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                ans.next=temp1;
                temp1=temp1.next;
                ans=ans.next;
            }
            else{
                ans.next=temp2;
                temp2=temp2.next;
                ans=ans.next;
            }
        }
        if(temp1==null){
            ans.next=temp2;
        }
        else{
            ans.next=temp1;
        }
        return dummy.next;
    }
}