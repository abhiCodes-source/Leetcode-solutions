class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {
            ListNode first = temp.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            temp.next = second;

            temp = first;
        }

        return dummy.next;
    }
}