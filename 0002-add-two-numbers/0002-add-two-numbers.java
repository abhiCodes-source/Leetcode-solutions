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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        ListNode t1=l1;
        ListNode t2=l2;
        int prev=0;
        while(t1!=null && t2!=null){
            int help=t1.val+t2.val+prev;
            prev=help/10;;
            ListNode melt=new ListNode(help%10);
            temp.next=melt;
            t1=t1.next;
            t2=t2.next;
            temp=temp.next;
        }
        while(t1!=null){
            int help=t1.val+prev;
            prev=help/10;;
            ListNode melt=new ListNode(help%10);
            temp.next=melt;
            t1=t1.next;
            temp=temp.next;
        }
        while(t2!=null){
            int help=t2.val+prev;
            prev=help/10;;
            ListNode melt=new ListNode(help%10);
            temp.next=melt;
            t2=t2.next;
            temp=temp.next;
        }
        if (prev != 0) {
            temp.next = new ListNode(prev);
        }
        return ans.next;
    }
}